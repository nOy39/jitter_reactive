<template>
  <div class="contact-form">
    <h1>Contact Us</h1>
    <div class="txtb">
      <label>Full Name :</label>
      <input type="text" name="" value="" placeholder="Enter your name."/>
    </div>

    <div class="txtb">
      <label>Email :</label>
      <input type="email" name="" value="" placeholder="Enter your Email."/>
    </div>

    <div class="txtb">
      <label>Full Name :</label>
      <input type="text" name="" value="" placeholder="Enter your name."/>
    </div>

    <div class="txtb">
      <label>Message :</label>
      <textarea></textarea>
    </div>
    <a class="btn">Send</a>

  </div>
</template>

<script>
  export default {
    name: "Contacts"
  }
</script>

<style scoped>
  .contact-form {
    width: 85%;
    max-width: 600px;
    background: #f1f1f1;
    position: absolute;
    top: 40%;
    left: 50%;
    transform: translate(-50%, -50%);
    padding: 30px 40px;
    box-sizing: border-box;
    border-radius: 8px;
    text-align: center;
    box-shadow: 0 0 20px #000000b3;
    opacity: .75;
  }

  .contact-form h1 {
    margin-top: 0;
    font-weight: 200;
  }

  .txtb {
    border: 1px solid gray;
    margin: 8px 0;
    padding: 12px 18px;
    border-radius: 8px;
  }

  .txtb label {
    display: block;
    text-align: left;
    color: #333;
    text-transform: uppercase;
    font-size: 14px;
  }

  .txtb input, .txtb textarea {
    width: 100%;
    border: none;
    background: none;
    outline: none;
    font-size: 18px;
    margin-top: 6px;
  }

  .btn {
    display: inline-block;
    background: #4183c4;
    padding: 14px 0;
    color: white;
    text-transform: uppercase;
    cursor: pointer;
    margin-top: 8px;
    width: 100%;
  }
</style>
