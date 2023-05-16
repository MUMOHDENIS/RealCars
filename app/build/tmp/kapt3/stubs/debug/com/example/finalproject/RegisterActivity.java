package com.example.finalproject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u00061"}, d2 = {"Lcom/example/finalproject/RegisterActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "btnSignUp", "Landroid/widget/Button;", "getBtnSignUp", "()Landroid/widget/Button;", "setBtnSignUp", "(Landroid/widget/Button;)V", "edtUserEmail", "Landroid/widget/EditText;", "getEdtUserEmail", "()Landroid/widget/EditText;", "setEdtUserEmail", "(Landroid/widget/EditText;)V", "edtUserName", "getEdtUserName", "setEdtUserName", "edtUserPassword", "getEdtUserPassword", "setEdtUserPassword", "edtUserPasswordConfirmation", "getEdtUserPasswordConfirmation", "setEdtUserPasswordConfirmation", "edtUserPhoneNumber", "getEdtUserPhoneNumber", "setEdtUserPhoneNumber", "mAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "getMAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "setMAuth", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "progressDialog", "Landroid/app/ProgressDialog;", "getProgressDialog", "()Landroid/app/ProgressDialog;", "setProgressDialog", "(Landroid/app/ProgressDialog;)V", "tvSignIn", "Landroid/widget/TextView;", "getTvSignIn", "()Landroid/widget/TextView;", "setTvSignIn", "(Landroid/widget/TextView;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class RegisterActivity extends androidx.appcompat.app.AppCompatActivity {
    public android.widget.EditText edtUserName;
    public android.widget.EditText edtUserEmail;
    public android.widget.EditText edtUserPhoneNumber;
    public android.widget.EditText edtUserPassword;
    public android.widget.EditText edtUserPasswordConfirmation;
    public android.widget.TextView tvSignIn;
    public android.widget.Button btnSignUp;
    public android.app.ProgressDialog progressDialog;
    public com.google.firebase.auth.FirebaseAuth mAuth;
    
    public RegisterActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtUserName() {
        return null;
    }
    
    public final void setEdtUserName(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtUserEmail() {
        return null;
    }
    
    public final void setEdtUserEmail(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtUserPhoneNumber() {
        return null;
    }
    
    public final void setEdtUserPhoneNumber(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtUserPassword() {
        return null;
    }
    
    public final void setEdtUserPassword(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.EditText getEdtUserPasswordConfirmation() {
        return null;
    }
    
    public final void setEdtUserPasswordConfirmation(@org.jetbrains.annotations.NotNull
    android.widget.EditText p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.TextView getTvSignIn() {
        return null;
    }
    
    public final void setTvSignIn(@org.jetbrains.annotations.NotNull
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.widget.Button getBtnSignUp() {
        return null;
    }
    
    public final void setBtnSignUp(@org.jetbrains.annotations.NotNull
    android.widget.Button p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.ProgressDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.NotNull
    android.app.ProgressDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.auth.FirebaseAuth getMAuth() {
        return null;
    }
    
    public final void setMAuth(@org.jetbrains.annotations.NotNull
    com.google.firebase.auth.FirebaseAuth p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}