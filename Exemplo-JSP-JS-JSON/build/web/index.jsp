
<%@page import="pacotePrincipal.Classe1"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/d3.v3.min.js"></script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <svg class="chart"></svg>
        <script>
            var data = <%=Classe1.arrayToString(Classe1.emiteArray()) %>
            var width = 500, barHeight = 20;
            var x = d3.scale.linear()
                    .domain([0, d3.max(data)])
                    .range([0, width]);
            
            var chart = d3.select(".chart")
                        .attr("width", width)
			.attr("height", barHeight * data.length);
                
            var bar = chart.selectAll("g")
                    .data(data)
                    .enter().append("g")
                    .attr("transform", function(d, i) { return "translate(0," + i * barHeight + ")"; });
       
        
            bar.append("rect")
            .attr("width", x)
            .attr("height", barHeight - 1);
            
            bar.append("text")
            .attr("x", function(d) { return x(d) - 3; })
            .attr("y", barHeight / 2)
            .attr("dy", ".35em")
            .text(function(d) { return d; });
            
        </script>
    </body>
</html>
