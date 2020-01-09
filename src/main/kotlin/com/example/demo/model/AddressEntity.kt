package com.example.demo.model

import javax.persistence.*

@Entity
@Table(name = "address", schema = "dwellze_db", catalog = "")
@IdClass(AddressEntityPK::class)
open class AddressEntity {
    @get:Basic
    @get:Column(name = "add_entitytype", nullable = false)
    var addEntitytype: String? = null
    @get:Id
    @get:Column(name = "add_entityid", nullable = false)
    var addEntityid: String? = null
    @get:Id
    @get:Column(name = "add_srno", nullable = false)
    var addSrno: Int? = null
    @get:Basic
    @get:Column(name = "add_type", nullable = false)
    var addType: String? = null
    @get:Basic
    @get:Column(name = "add_line1", nullable = false)
    var addLine1: String? = null
    @get:Basic
    @get:Column(name = "add_address", nullable = false)
    var addAddress: String? = null
    @get:Basic
    @get:Column(name = "add_latitude", nullable = false)
    var addLatitude: Double? = null
    @get:Basic
    @get:Column(name = "add_longitude", nullable = false)
    var addLongitude: Double? = null
    @get:Basic
    @get:Column(name = "add_locality", nullable = true)
    var addLocality: String? = null
    @get:Basic
    @get:Column(name = "add_state", nullable = true)
    var addState: String? = null
    @get:Basic
    @get:Column(name = "add_pincode", nullable = true)
    var addPincode: String? = null
    @get:Basic
    @get:Column(name = "add_isactive", nullable = false)
    var addIsactive: String? = null
    @get:Basic
    @get:Column(name = "created_dt", nullable = false)
    var createdDt: java.sql.Timestamp? = null
    @get:Basic
    @get:Column(name = "created_by", nullable = true)
    var createdBy: String? = null
    @get:Basic
    @get:Column(name = "update_dt", nullable = false)
    var updateDt: java.sql.Timestamp? = null
    @get:Basic
    @get:Column(name = "update_by", nullable = true)
    var updateBy: String? = null


    override fun toString(): String =
            "Entity of type: ${javaClass.name} ( " +
                    "addEntitytype = $addEntitytype " +
                    "addEntityid = $addEntityid " +
                    "addSrno = $addSrno " +
                    "addType = $addType " +
                    "addLine1 = $addLine1 " +
                    "addAddress = $addAddress " +
                    "addLatitude = $addLatitude " +
                    "addLongitude = $addLongitude " +
                    "addLocality = $addLocality " +
                    "addState = $addState " +
                    "addPincode = $addPincode " +
                    "addIsactive = $addIsactive " +
                    "createdDt = $createdDt " +
                    "createdBy = $createdBy " +
                    "updateDt = $updateDt " +
                    "updateBy = $updateBy " +
                    ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as AddressEntity

        if (addEntitytype != other.addEntitytype) return false
        if (addEntityid != other.addEntityid) return false
        if (addSrno != other.addSrno) return false
        if (addType != other.addType) return false
        if (addLine1 != other.addLine1) return false
        if (addAddress != other.addAddress) return false
        if (addLatitude != other.addLatitude) return false
        if (addLongitude != other.addLongitude) return false
        if (addLocality != other.addLocality) return false
        if (addState != other.addState) return false
        if (addPincode != other.addPincode) return false
        if (addIsactive != other.addIsactive) return false
        if (createdDt != other.createdDt) return false
        if (createdBy != other.createdBy) return false
        if (updateDt != other.updateDt) return false
        if (updateBy != other.updateBy) return false

        return true
    }

}

class AddressEntityPK : java.io.Serializable {
    @get:Id
    @get:Column(name = "add_entityid", nullable = false)
    var addEntityid: String? = null
    @get:Id
    @get:Column(name = "add_srno", nullable = false)
    var addSrno: Int? = null

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as AddressEntityPK

        if (addEntityid != other.addEntityid) return false
        if (addSrno != other.addSrno) return false

        return true
    }

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

}
