package akkaquote.actor

import akka.actor.Actor
import scala.collection.mutable.ListBuffer
import scala.util.Random
import akkaquote.message.Quote
import akkaquote.message.{ AddQuote, QuoteAdded, RequestQuote, QuoteRequested }

class QuotesHandlerActor extends Actor {
      
  val quotes = new ListBuffer[Quote]

  def receive = {
    case AddQuote(quote) => {
      quotes += quote
      sender ! QuoteAdded
    }

    case RequestQuote(originalSender) => {
      val index = Random.nextInt(quotes.size)
      sender ! QuoteRequested(quotes(index), originalSender)
    }
  } 
}