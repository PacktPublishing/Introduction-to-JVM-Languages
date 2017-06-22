package akkaquote.actor

import akka.actor.{ Actor, ActorRef }
import akkaquote.message.{ PrintRandomQuote, RequestQuote, QuoteRequested, QuotePrinted }

class QuotePrinterActor(val quoteManagerActorRef: ActorRef) extends Actor {

  def receive: Actor.Receive = {

    case PrintRandomQuote => {
      val originalSender = sender
      quoteManagerActorRef ! RequestQuote(originalSender)
    }
  
    case QuoteRequested(quote, originalSender) => {
      System.out.println('"' + quote.quote + '"')
      System.out.println("-- " + quote.author)
      originalSender ! QuotePrinted
    }

  }  
}