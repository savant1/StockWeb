<%-- 
    Document   : newfournisseur
    Created on : 11 juin 2016, 18:03:51
    Author     : ferry
--%>

<section id="our-team">
    <div class="container">
      <div class="row">
          <div class="col-md-12">
              <div class="col-md-2"></div>
              <div class="col-md-8">
                 <div class="contact-area-right">
                     <form action="savenewfournisseur" method="POST" class="comments-form contact-form">
                    <div class="form-group">                        
                        <input type="text" name="nomSociete" required="required" class="form-control" placeholder="Nom Societe">
                    </div>
                    <div class="form-group">                        
                        <input type="text" name="nomfournisseur" required="required" class="form-control" placeholder="Nom Fournisseur">
                    </div>
                       <input type="submit" class="btn btn-lg btn-success" value="Cree"/>
                  </form>
                 </div>
               </div>
          </div>
      </div>
    </div>
</section>
