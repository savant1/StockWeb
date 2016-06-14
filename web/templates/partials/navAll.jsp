
  <!-- BEGIN MENU -->
  <section id="menu-area">      
    <nav class="navbar navbar-default" role="navigation">  
      <div class="container">
        <div class="navbar-header">
          <!-- FOR MOBILE VIEW COLLAPSED BUTTON -->
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <!-- LOGO -->              
          <!-- TEXT BASED LOGO -->
          <a class="navbar-brand" href="home.jsp">GESTION DE STOCK</a>              
          <!-- IMG BASED LOGO  -->
           <!-- <a class="navbar-brand" href="index.html"><img src="assets/images/logo.png" alt="logo"></a> -->
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul id="top-menu" class="nav navbar-nav navbar-right main-nav">
            <li class="active"><a href="home.jsp">Home</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Clientelle <span class="fa fa-angle-down"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="newclient.jsp">Cree un nouveau client</a></li>  
                <li><a href="listClient">Voir tous les clients</a></li>                
                <li><a href="commandeclientservlet">commande clientelle</a></li>         
              </ul> 
            </li>      
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Produits <span class="fa fa-angle-down"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="newproduit.jsp">Cree un nouveau Produit</a></li>                
                <li><a href="allproduits.jsp">Voir tous les Produits</a></li>         
              </ul>
            </li>    
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Fournisseurs <span class="fa fa-angle-down"></span></a>
              <ul class="dropdown-menu" role="menu">
                <li><a href="newfournisseur.jsp">Cree un nouveau Fournisseur</a></li>                
                <li><a href="allfournisseurss.jsp">Voir tous les Fournisseurs</a></li>         
              </ul>
            </li>             
            <li><a href="contact.jsp">Contact</a></li>
          </ul>                     
        </div><!--/.nav-collapse -->
        <a href="#" id="search-icon">
          <i class="fa fa-search">            
          </i>
        </a>
      </div>     
    </nav>
  </section>
  <!-- END MENU --> 