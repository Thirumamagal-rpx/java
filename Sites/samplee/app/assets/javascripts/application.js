// This is a manifest file that'll be compiled into application.js, which will include all the files
// listed below.
//
// Any JavaScript/Coffee file within this directory, lib/assets/javascripts, or any plugin's
// vendor/assets/javascripts directory can be referenced here using a relative path.
//
// It's not advisable to add code directly here, but if you do, it'll appear at the bottom of the
// compiled file. JavaScript code in this file should be added after the last require_* statement.
//
// Read Sprockets README (https://github.com/rails/sprockets#sprockets-directives) for details
// about supported directives.
//
//= require rails-ujs
//= require turbolinks
//= require_tree .
// function checkForm(form)
//   {
//     if(form.username.value == "") {
//       alert("Error: Username cannot be blank!");
//       form.username.focus();
//       return false;
//     }
//     re = /^\w+$/;
//     if(!re.test(form.username.value)) {
//       alert("Error: Username must contain only letters, numbers and underscores!");
//       form.username.focus();
//       return false;
//     }

//     if(form.pwd1.value != "" && form.pwd1.value == form.pwd2.value) {
//       if(form.pwd1.value.length < 6) {
//         alert("Error: Password must contain at least six characters!");
//         form.pwd1.focus();
//         return false;
//       }
//       if(form.pwd1.value == form.username.value) {
//         alert("Error: Password must be different from Username!");
//         form.pwd1.focus();
//         return false;
//       }
//       re = /[0-9]/;
//       if(!re.test(form.pwd1.value)) {
//         alert("Error: password must contain at least one number (0-9)!");
//         form.pwd1.focus();
//         return false;
//       }
//       re = /[a-z]/;
//       if(!re.test(form.pwd1.value)) {
//         alert("Error: password must contain at least one lowercase letter (a-z)!");
//         form.pwd1.focus();
//         return false;
//       }
//       re = /[A-Z]/;
//       if(!re.test(form.pwd1.value)) {
//         alert("Error: password must contain at least one uppercase letter (A-Z)!");
//         form.pwd1.focus();
//         return false;
//       }
//     } else {
//       alert("Error: Please check that you've entered and confirmed your password!");
//       form.pwd1.focus();
//       return false;
//     }

//     alert("You entered a valid password: " + form.pwd1.value);
//     return true;
//   }

// </script>

// // <p>Username: <input type="text" name="username"></p>
// // <p>Password: <input type="password" name="pwd1"></p>
// // <p>Confirm Password: <input type="password" name="pwd2"></p>
// // <p><input type="submit"></p>
// // </form>