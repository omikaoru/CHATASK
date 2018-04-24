package com.example.chatTask

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping


@Controller
@RequestMapping("chats")
class ChatController {
    @GetMapping("")
    fun index(model: Model): String {
        model.addAttribute("chats")
        return "chats/index"
    }

    @GetMapping("new")
    fun new(form: ChatCreateForm): String {
        return "chats/new"
    }
}