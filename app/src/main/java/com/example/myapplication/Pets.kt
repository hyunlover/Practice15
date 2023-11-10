package com.example.myapplication
import  android.os.Parcel
import android.os.Parcelable
class Pets ():Parcelable{
    private var breed:String=""
    private var year: Int =0
    private var month : Int =0
    constructor(parcel: Parcel) : this() {
        breed = parcel.readString().toString()
        year = parcel.readInt()
        month= parcel.readInt()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel?.writeString(breed)
        parcel?.writeInt(year)
        parcel?.writeInt(month)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pets> {
        override fun createFromParcel(parcel: Parcel): Pets {
            return Pets(parcel)
        }

        override fun newArray(size: Int): Array<Pets?> {
            return arrayOfNulls(size)
        }
    }
    constructor(_breed: String, _year: Int, _month: Int) : this() {
        breed = _breed
        year= _year
        month= _month
    }
    fun setBreed(_breed: String){
        breed = _breed
    }
    fun getBreed(): String {
        return breed
    }
    fun setYear(_year: Int){
        year = _year
    }
    fun getYear(): Int{
        return year
    }
    fun setMonth(_month: Int){
        month = _month
    }
    fun getMonth(): Int {
        return month
    }

}