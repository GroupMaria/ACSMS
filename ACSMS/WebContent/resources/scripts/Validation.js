function valideForm(txtVal) {
    if (txtVal == "" || txtVal == null) {
        return false;
    }
    else return true;
}

function doSave() {
    var fOk = false
    var strMsg
    var valcombTitle = document.forms["frmCustCreate"]["combTitle"].value;
    var valtxtFName = document.forms["frmCustCreate"]["txtFName"].value;
    var valtxtLName = document.forms["frmCustCreate"]["txtLName"].value;
    var valtxtCompany = document.forms["frmCustCreate"]["txtCompany"].value;
    var valtxtStreet = document.forms["frmCustCreate"]["txtStreet"].value;
    var valtxtCity = document.forms["frmCustCreate"]["txtCity"].value;
    var valcombProvince = document.forms["frmCustCreate"]["combProvince"].value;
    var valtxtPosCod = document.forms["frmCustCreate"]["txtPosCod"].value;    
    var valtxtCountry = document.forms["frmCustCreate"]["txtCountry"].value;
    var valtxtPhone = document.forms["frmCustCreate"]["txtPhone"].value;    
    var valtxtEmail = document.forms["frmCustCreate"]["txtEmail"].value;
    var valtxtEmailConf = document.forms["frmCustCreate"]["txtEmailConf"].value;

    console.log(valcombTitle);
    console.log(valcombProvince);

    if (!valideForm(valtxtFName)) {
        alert("First Name is a required field.");
        return false
    }

    if (!valideForm(valtxtLName)) {
        fOk = false
        alert("Last Name is a required field.");
        return false
    }

    if (!valideForm(valtxtEmail)) {
        fOk = false
        alert("Email is a required field.");
        return false
    }

    var regEx2 = /([a-zA-Z0-9_.-])+@([a-zA-Z0-9_.-])+\.([a-zA-Z])+([a-zA-Z])+/;
    if (!regEx2.test(document.getElementById("txtEmail").value)) {
        alert("Invalid Email.")
        return false
    }

    if (!valideForm(valtxtEmailConf)) {
        fOk = false
        alert("You need to confirm your Email.");
        return false
    }


    

    /*
    if (valtxtEmail.value.indexOf("@") == -1
        || valtxtEmail.value.indexOf(".") == -1) {
        fOk = false;
        strMsg = "The entered e-mail address is not " +
        "valid.\nE-mail addresses must " +
        "be in the form name@domain."
        alert(strMsg);
        return false
    }
    */

    var regEx = /[a-zA-Z][0-9][a-zA-Z](-| |)[0-9][a-zA-Z][0-9]/;
    if (valideForm(valtxtPosCod)) {
        if (regEx.test(document.getElementById("txtPosCod").value)) {

        }
        else {
            alert("Invalid Postal Code");
            return false;
        }
    }

    if (valtxtEmail != valtxtEmailConf) {
        alert("You have not confirmed your Email. Two Emails has to be the same.")
        return false;
    }

    

    else {
        alert("Thanks for registering with our website, "
            + "your customer record was created successfully.")
        return true;
    }

    /*    if(fOk) 
        {
            return true
        }
        else
        {
            alert(strMsg);
            return false;
        }
    */
}