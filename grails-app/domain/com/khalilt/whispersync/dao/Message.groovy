package com.khalilt.whispersync.dao

import com.khalilt.whispersync.User

class Message {
    UUID id
    String content
    Date dateCreated
    Date datUpdated
    Date deliveredAt
    Date readAt

    static constraints = {
    }
    
    static belongsTo = {
        [user: User]
    }
}
