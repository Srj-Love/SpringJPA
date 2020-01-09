package com.example.demo

import com.example.demo.model.AccountsEntity
import com.example.demo.model.AddressEntity
import com.example.demo.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component

@Component
interface UserRepository:JpaRepository<AccountsEntity,Long> {
    fun findByName(name: String): AccountsEntity

}