/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.chess.game;

import fr.rphstudio.chess.interf.IChess;
import fr.rphstudio.chess.interf.IChess.ChessColor;
import fr.rphstudio.chess.interf.IChess.ChessType;
import fr.rphstudio.chess.interf.IMove;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author DOOM GUYS.
 */
public class Piece {
    
    private ChessColor color;
    private ChessType type;
    private IMove move;
         
    public Piece(ChessColor color, ChessType type, IMove move){
        this.color = color;
        this.type = type;
        this.move = move;
    }
    
    public ChessColor getColor(){
        return this.color;
    }
    
    public ChessType getType(){
        return this.type;
    }
    
    public List<IChess.ChessPosition> getMoves(IChess.ChessPosition pos, ChessBoard board) {
        return move.getPossibleMove(pos, board);
    }
    
    
}
