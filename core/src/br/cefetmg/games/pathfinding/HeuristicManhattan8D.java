/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.games.pathfinding;

import com.badlogic.gdx.ai.pfa.Heuristic;

/**
 *
 * @author Aluno
 */
public class HeuristicManhattan8D implements Heuristic<TileNode>{

    @Override
    public float estimate(TileNode n, TileNode n1) {
        float dx = Math.abs(n.getPosition().x - n1.getPosition().x)/9;
        float dy = Math.abs(n.getPosition().y - n1.getPosition().y)/9;
        float D=1,D2=(float) Math.sqrt(2);
        return D * (dx + dy) + (D2 - 2 * D) * Math.min(dx, dy);
    }
    
}
