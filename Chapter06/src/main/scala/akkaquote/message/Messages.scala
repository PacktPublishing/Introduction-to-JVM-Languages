package akkaquote.message

import akka.actor.ActorRef

class Quote(val quote: String, val author: String)

case class AddQuote(quote: Quote)
case class RequestQuote(originalSender: ActorRef)
case object PrintRandomQuote

case object QuoteAdded
case class QuoteRequested(quote: Quote, originalSender: ActorRef)
case object QuotePrinted