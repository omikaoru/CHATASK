package com.example.chatTask

import org.hibernate.validator.constraints.NotBlank
import javax.validation.constraints.Size

class ChatCreateForm {

    @NotBlank
    @Size(max =20)
    var content: String? = null
    var message: String? = null
}