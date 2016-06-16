<%-- 
    Document   : allclientscontent
    Created on : 12 juin 2016, 08:45:09
    Author     : ferry
--%>


<%@page import="com.thedevbridge.stockweb.entities.Commande"%>
<%@page import="java.util.List"%>
<%@page import="com.thedevbridge.stockweb.entities.Client"%>
<section id="our-team">
    <div class="container">
      <div class="row">
          <div class="col-md-12">
              <table class="table table-striped table-bordered bootstrap-datatable datatable responsive">
                        <thead>
                            <tr>
                                <th>nom client</th>
                                <th>adresse client</th>
                                <th>contact client</th>
                                <th>nombre de commande du client</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%List<Client> cl =(List)request.getAttribute("listeClient");%>
                                  <%for (int j=0;j<cl.size();j++){
                                          Client client = (Client)cl.get(j);
                                  %>
                                  <tr>
                                        <td><%=client.getNom()%></td>
                                        <td><%=client.getAdresse()%></td>
                                        <td><%=client.getContact()%></td>
                                        <td><%=client.getNom()%></td>
                                        <td>
                                            <form method="POST" action="">
                                                <input type="hidden" value="<%=client.getId()%>" name="idClient">
                                                <input class="btn btn-info" name="edit" type="submit" value="Editer">
                                                <input class="btn btn-danger" name="del" type="submit" value="Delete">
                                            </form>
                                        </td>
                                  </tr>
                                  <%} %>
                        </tbody>
                    </table>
                        <%List<Commande> c =(List)request.getAttribute("listeCommande");%>
                        
                        <%=c.size()%>
          </div>
      </div>
    </div>
</section>
