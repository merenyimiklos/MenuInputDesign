package com.example.menuinputdesign;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class ProfileFragment extends Fragment {

    private TextInputLayout editTextEmail, editTextPassword;
    private MaterialButton buttonSubmit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        init(view);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextEmail.getEditText().getText().toString();
                String password = editTextPassword.getEditText().getText().toString();
                if (email.isEmpty()) {
                    editTextEmail.setError("Nem lehet üres az email");
                } else {
                    editTextEmail.setError(null);
                }
                if (password.isEmpty()){
                    editTextPassword.setError("Nem lehet üres a jelszó");
                } else {
                    editTextPassword.setError(null);
                }
            }
        });
        return view;
    }

    public void init(View view) {
        editTextEmail = view.findViewById(R.id.editTextEmail);
        editTextPassword = view.findViewById(R.id.editTextPassword);
        buttonSubmit = view.findViewById(R.id.buttonSubmit);
    }
}