package com.example.messagingapp

class Message {

    var message: String? = null
    var senderId: String? = null

    //constructor is empty
    constructor(){}

    constructor(message: String?, senderId: String?){
        this.message = message
        this.senderId = senderId
    }
}
