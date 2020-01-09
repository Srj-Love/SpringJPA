package com.example.demo.model

import javax.persistence.*

@Entity
@Table(name = "accounts")
open class AccountsEntity {
    @get:Id
    @get:Column(name = "id", nullable = false)
    var id: Int? = null
    @get:Basic
    @get:Column(name = "account_no", nullable = false)
    var accountNo: String? = null
    @get:Basic
    @get:Column(name = "name", nullable = false)
    var name: String? = null
    @get:Basic
    @get:Column(name = "initial_balance", nullable = true)
    var initialBalance: Double? = null
    @get:Basic
    @get:Column(name = "total_balance", nullable = false)
    var totalBalance: Double? = null
    @get:Basic
    @get:Column(name = "note", nullable = true)
    var note: String? = null
    @get:Basic
    @get:Column(name = "is_default", nullable = true)
    var isDefault: Byte? = null
    @get:Basic
    @get:Column(name = "is_active", nullable = false)
    var isActive: Byte? = null
    @get:Basic
    @get:Column(name = "created_at", nullable = true)
    var createdAt: java.sql.Timestamp? = null
    @get:Basic
    @get:Column(name = "updated_at", nullable = true)
    var updatedAt: java.sql.Timestamp? = null


}

