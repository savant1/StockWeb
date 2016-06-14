<%-- 
    Document   : commandeclientscontents
    Created on : 13 juin 2016, 14:36:45
    Author     : ferry
--%>
    
<%@page import="com.thedevbridge.stockweb.entities.Produit"%>
<%@page import="java.util.List"%>
<%@page import="com.thedevbridge.stockweb.entities.Client"%>
<section id="our-team">
    <div class="container">
      <div class="row">
          <div class="col-md-12">
                <div class="col-md-2"></div>
                <div class="col-md-8">
                    <div class="contact-area-right">
                        <form action="CommandeServlet" method="POST" class="comments-form contact-form">
                              <div class="form-group">                        
                                  <input type="int" name="id" required="required" class="form-control" placeholder="Numero Commande">
                              </div>
                              <div class="form-group">                        
                                  <input type="int" name="facture" required="required" class="form-control" placeholder="Numero Facture">
                              </div>
                               <div class="form-group">                        
                                <input type="int" name="quantite" required="required" class="form-control" placeholder="Quantite Produit">
                              </div>
                              <div class="form-group">                        
                                <input type="int" name="prix" required="required" class="form-control" placeholder="Prix Produit">
                              </div>
                              <div class="form-group">                        
                                <input type="date" name="date" required="required" class="form-control" placeholder="Date Commande">
                              </div>
                              <div class="form-group">                        
                                <input type="time" name="heure" required="required" class="form-control" placeholder="Heure Commande">
                              </div>
                              <div class="form-group">
                                  <%List<Client>cl =(List)request.getAttribute("listeClient");%>
                                  <SELECT name="client" size="1">
                                  <%for (int j=0;j<cl.size();j++){
                                          Client client = (Client)cl.get(j);
                                  %>
                                  <OPTION value="<%=client.getId()%>"><%=client.getNom()%></OPTION>
                                  <%} %>
                                  </SELECT>
                              </div>
                              <div class="form-group">
                                  <%List<Produit>pd =(List)request.getAttribute("listeProduit");%>
                                  <SELECT name="produit" size="1">
                                  <%for (int j=0;j<pd.size();j++){
                                          Produit produit = (Produit)pd.get(j);
                                  %>
                                  <OPTION value="<%=produit.getIdProduit()%>"><%=produit.getReference()%></OPTION>
                                  <%} %>
                                  </SELECT>
                              </div>    
                              <div class="form-group">                        
                                <input type="text" name="total" required="required" class="form-control" placeholder="Prix_total Produit">
                              </div>
                                 <input type="submit" class="btn btn-lg btn-success" value="Cree"/>
                            </form>
                    </div>          
                </div>   
           </div>
      </div>
    </div>
</section>
