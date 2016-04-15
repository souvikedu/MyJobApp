package com.amaderorg.myjobapp.Presenter.Contacts;

import android.content.Context;

import com.amaderorg.myjobapp.Model.Database.DBManager;
import com.amaderorg.myjobapp.Model.Database.Tables.Contact;

/**
 * Created by souvi_000 on 3/28/2016.
 */
public class ContactInformationPresenter implements IContactInformationPresenter {
    private Context mContext;
    private DBManager manager;
    public ContactInformationPresenter(Context context){
        manager = new DBManager(context);
    }

    @Override
    public void addContactInformation(Contact contact) {
        manager.addContact(contact);
    }
}
