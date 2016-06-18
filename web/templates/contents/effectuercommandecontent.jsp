<%-- 
    Document   : effectuercommandecontent
    Created on : 18 juin 2016, 10:49:25
    Author     : ferry
--%>

<%@page import="java.util.List"%>
<%@page import="com.thedevbridge.stockweb.entities.Produit"%>
<section id="our-team">
    <div class="container">
      <div class="row">
          <div class="col-md-12">
              <div class="col-md-2"></div>
              <div class="col-md-8">
                 <div class="contact-area-right">
                     <% 
                         int idclient = (Integer)request.getAttribute("idclient");
                         String numcommande = (String)request.getAttribute("numcommande");
                     %>
                     <form action="effectuercommande" method="POST" class="comments-form contact-form">
                        <div class="form-group">                        
                            <input type="hidden" name="idclient"  class="form-control" value="<%=idclient%>">
                        </div>
                        <div class="form-group col-xs-3">                        
                            <input type="number" name="qantite" required="required" class="form-control" placeholder="Quantite">
                        </div>
                        <div class="form-group col-xs-9">
                            <%List<Produit> pd =(List)request.getAttribute("listeProduit");%>
                            <SELECT name="produit" size="1">
                                <OPTION value="">SELECTIONNER LE PRODUIT A FACTURER</OPTION>
                                <%for (int j=0; j< pd.size();j++){
                                        Produit produit = (Produit)pd.get(j);
                                %>
                                <OPTION value="<%=produit.getIdProduit()%>"><%=produit.getDesignation()%></OPTION>
                                <%} %>
                            </SELECT>
                        </div>  
                        <div class="form-group">                        
                            <input type="hidden" name="numcommande"  class="form-control" value="<%=numcommande%>">
                        </div>
                       <input type="submit" class="btn btn-lg btn-success" value="Ajouter a la commande"/>
                  </form>
                 </div>
               </div>
          </div>
      </div>
    </div>
</section>