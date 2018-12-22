package org.elsys.netprog.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/game")
public class GameController {
	
	Integer gameID = 0;
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	
	@POST
	@Path("/startGame")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response startGame() throws URISyntaxException{
		map.put(gameID + 1, Game.target);
		return Response.created(new URI("/games"))
				.entity(gameID)
				.build();
	}
	
	@PUT
	@Path("/guess/{id}/{guess}")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response guess(@PathParam("id") String gameId, @PathParam("guess") String guess) throws Exception{
		if(gameId != gameID.toString()) {
			return Response.status(404).build();
		} else {
			Game.main(guess);
			if(Game.predictedCount) {
				return Response.status(200)
						.entity(gameId)
						.entity(Game.cows)
						.entity(Game.bulls)
						.entity(Game.predictionsCount)
						.build();
			} else {
				return Response.status(400).build();
			}
		}
	}
	
	@GET
	@Path("/games")
	@Produces(value={MediaType.APPLICATION_JSON})
	public Response getGames() {
		//I HAVE NO IDEA HOW TO DO THIS ONE
		return Response.status(404).build();
	}
}
