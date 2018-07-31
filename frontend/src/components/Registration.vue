<template>
  <div class="container">
    <form class="pt-3" @submit.prevent="onSubmit">
      <div class="form-group">
        <label for="email">Email</label>
        <input type="email"
               class="form-control"
               :class="{'is-invalid': $v.email.$error}"
               @blur="$v.email.$touch()"
               id="email"
               v-model="email">
        <div class="invalid-feedback"
             v-if="!$v.email.required">Email field is required
        </div>
        <div class="invalid-feedback"
             v-if="!$v.email.uniqEmail">This email is already exists
        </div>
        <div class="invalid-feedback"
             v-if="!$v.email.email">Is no email format
        </div>

      </div>
      <div class="form-group">
        <label for="password">Password</label>
        <input type="password"
               class="form-control"
               :class="{'is-invalid': $v.password.$error}"
               @blur="$v.password.$touch()"
               id="password"
               v-model="password">
        <div
          class="invalid-feedback"
          v-if="!$v.password.minLength">Min length of password is {{ 6 }}. Now it is {{ password.length }}
        </div>
      </div>
      <div class="form-group">
        <label for="confirm">Confirm password</label>
        <input type="password"
               class="form-control"
               :class="{'is-invalid': $v.confirmPassword.$error}"
               @blur="$v.confirmPassword.$touch()"
               id="confirm"
               v-model="confirmPassword">
        <div
          class="invalid-feedback"
          v-if="!$v.confirmPassword.sameAs">Password are different
        </div>
      </div>
      <button
        class="btn btn-success"
        type="submit"
        :disabled="$v.$invalid">Submit</button>
    </form>
  </div>
</template>

<script>
  import {required, email, minLength, sameAs} from 'vuelidate/lib/validators'

  export default {
    name: "Registration",
    data() {
      return {
        email: '',
        password: '',
        confirmPassword: '',
      }
    },
    methods:{
      onSubmit(){
        console.log('Email: ', this.email);
        console.log('Password: ', this.password);
      }
    },
    validations: {
      email: {
        required,
        email,
        uniqEmail: function (newEmail) {
          if (newEmail === '') return true;
          return new Promise((resolve, reject) => {
            setTimeout(() => {
              const value = newEmail !== 'test@mail.ru';
              resolve(value);
            }, 1000)
          });
        }
      },
      password: {
        minLength: minLength(6),
      },
      confirmPassword: {
        sameAs: sameAs('password')
      }
    }
  }
</script>

<style scoped>

</style>
