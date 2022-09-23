package com.test2.model;

public class Author extends BasePerson {
   private Long birthDay;

public Long getBirthDay() {
    return birthDay;
}

public void setBirthDay(Long birthDay) {
    this.birthDay = birthDay;
}
     public Author (String firstname , String lastname , long birthDay ){
        setFirstName(firstname);
        setLastName(lastname);
        this.birthDay = birthDay;
     }

    public Author() {
    }





     
}
