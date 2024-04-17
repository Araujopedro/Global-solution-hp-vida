class MenuNavbar {
    constructor(menuHamburguer, menuList, menuLinks) {
      this.menuHamburguer = document.querySelector(menuHamburguer);
      this.navList = document.querySelector(menuList);
      this.navLinks = document.querySelectorAll(menuLinks);
      this.activeClass = "active";
  
      this.handleClick = this.handleClick.bind(this);
    }
  
    animateLinks() {
      this.navLinks.forEach((link, index) => {
        link.style.animation
          ? (link.style.animation = "")
          : (link.style.animation = `navLinkFade 0.5s ease forwards ${
              index / 7 + 0.3
            }s`);
      });
    }
  
    handleClick() {
      this.navList.classList.toggle(this.activeClass);
      this.menuHamburguer.classList.toggle(this.activeClass);
      this.animateLinks();
    }
  
    addClickEvent() {
      this.menuHamburguer.addEventListener("click", this.handleClick);
    }
  
    init() {
      if (this.menuHamburguer) {
        this.addClickEvent();
      }
      return this;
    }
  }
  
  const menuNavbar = new MenuNavbar(
    ".menuHamburguer",
    ".menuList",
    ".menuList li",
  );
  menuNavbar.init();

  function validar(){
    //nome = document.frmCad.txtUser
    senha = document.getElementById("pwdSenha");
    email = document.getElementById("txtEmail");
    erroSenha = document.getElementById("erroSenha");
    erroEmail = document.getElementById("erroEmail");

    if (email.value == ""){
      email.focus();
      erroEmail.innerText = "Campo Email é obrigatório!";
      return false;
    }
    else{
      erroEmail.innerText=""
    } 

    if (senha.value == ""){
        senha.focus();
        erroSenha.innerText = "Campo Senha é obrigatório!";
        return false;
    }
    else{
      erroSenha.innerText=""
    }

    
  



  
  }