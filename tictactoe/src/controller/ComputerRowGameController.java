package controller;

import model.BlockIndex;

public class ComputerRowGameController extends RowGameController {

    @Override
    public void move(BlockIndex blockIndex) {
        move4Computer(blockIndex);

        // Find the first legal move and execute it
        for (int i = 0; i < gameModel.blocksData.length; i++) {
            for (int j = 0; j < gameModel.blocksData[i].length; j++) {
                if (gameModel.blocksData[i][j].getIsLegalMove()) {
                    move4Computer(new BlockIndex(i, j));
                    return;
                }
            }
        }
    }

}
//
