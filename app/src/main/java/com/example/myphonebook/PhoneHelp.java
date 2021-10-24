package com.example.myphonebook;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.lang.annotation.Target;

public class PhoneHelp {
    private DatabaseReference databaseReference;

    public PhoneHelp(DatabaseReference databaseReference) {
        //this.databaseReference = databaseReference;
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(Phone.class.getSimpleName());
    }

    public PhoneHelp() {

    }

    public  Task<Void> add(Phone phone){
        return databaseReference.push().setValue(phone);
    }
    public Query get(){
        return databaseReference.orderByKey();
    }

}

