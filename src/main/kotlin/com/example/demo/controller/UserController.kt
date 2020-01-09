package com.example.demo.controller

import com.example.demo.UserRepository
import com.example.demo.model.AccountsEntity
import com.example.demo.model.AddressEntity
import com.example.demo.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    private var mUserRepository: UserRepository? = null

    @GetMapping(value = arrayOf("/all"))
    public fun findAll(): List<AccountsEntity> {
        return mUserRepository!!.findAll()
    }

    @GetMapping(value = arrayOf("{/name}"))
    public fun findById(@PathVariable name:String): AccountsEntity {
        return mUserRepository!!.findByName(name)
    }
}