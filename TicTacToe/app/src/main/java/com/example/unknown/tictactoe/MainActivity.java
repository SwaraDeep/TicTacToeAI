package com.example.unknown.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button reset, resetScore;
    TextView box00, box01, box02, box10, box11, box12, box20, box21, box22, playerX, playerO, scoreXText, scoreOText;
    int playerTurn = 1, winner, scoreX = 0, scoreO = 0;
    boolean isOver = false, AIGame = false, isAIPlayed = false;
    TextView viewPlayWithAI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box00 = findViewById(R.id.block_00);
        box01 = findViewById(R.id.block_01);
        box02 = findViewById(R.id.block_02);
        box10 = findViewById(R.id.block_10);
        box11 = findViewById(R.id.block_11);
        box12 = findViewById(R.id.block_12);
        box20 = findViewById(R.id.block_20);
        box21 = findViewById(R.id.block_21);
        box22 = findViewById(R.id.block_22);
        reset = findViewById(R.id.btn_reset);
        scoreXText = findViewById(R.id.scoreX);
        scoreOText = findViewById(R.id.scoreO);
        resetScore = findViewById(R.id.btn_reset_score);
        viewPlayWithAI = findViewById(R.id.img_play_AI);
        viewPlayWithAI.setBackgroundColor(getResources().getColor(R.color.white));

        box00.setText("");
        box01.setText("");
        box02.setText("");
        box10.setText("");
        box11.setText("");
        box12.setText("");
        box20.setText("");
        box21.setText("");
        box22.setText("");

        scoreXText.setText("0");
        scoreOText.setText("0");

        playerX = findViewById(R.id.playerx_text);
        playerO = findViewById(R.id.playero_text);
        changePlayerTextColor();

        viewPlayWithAI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!AIGame) {
                    AIGame = true;
                    viewPlayWithAI.setBackgroundColor(getResources().getColor(R.color.green));
                    playerO.setText("AI O");
                } else if (AIGame) {
                    AIGame = false;
                    viewPlayWithAI.setBackgroundColor(getResources().getColor(R.color.white));
                    playerO.setText("Player O");
                }
            }
        });

        box00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOver) {
                    if (AIGame) {
                        playerO.setTextColor(getResources().getColor(R.color.gray));
                        playerX.setTextColor(getResources().getColor(R.color.black));
                        if (playerTurn == 1 && box00.getText() == "") {
                            box00.setText("x");
                            isAIPlayed = false;
                            isWin();
                            AITurn();
                        } else {
                            AITurn();
                        }
                    } else if (!AIGame) {
                        if (box00.getText() == "") {
                            if (playerTurn == 1) {
                                box00.setText("x");
                                playerX.setTextColor(getResources().getColor(R.color.gray));
                                playerO.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 2;
                                isWin();
                            } else if (playerTurn == 2) {
                                box00.setText("o");
                                playerO.setTextColor(getResources().getColor(R.color.gray));
                                playerX.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 1;
                                isWin();
                            }
                        }
                    }
                }
            }
        });

        box01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOver) {
                    if (AIGame) {
                        playerO.setTextColor(getResources().getColor(R.color.gray));
                        playerX.setTextColor(getResources().getColor(R.color.black));
                        if (playerTurn == 1 && box01.getText() == "") {
                            box01.setText("x");
                            isAIPlayed = false;
                            isWin();
                            AITurn();
                        } else {
                            AITurn();
                        }
                    } else if (!AIGame) {
                        if (box01.getText() == "") {
                            if (playerTurn == 1) {
                                box01.setText("x");
                                playerX.setTextColor(getResources().getColor(R.color.gray));
                                playerO.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 2;
                                isWin();
                            } else if (playerTurn == 2) {
                                box01.setText("o");
                                playerO.setTextColor(getResources().getColor(R.color.gray));
                                playerX.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 1;
                                isWin();
                            }
                        }
                    }
                }
            }
        });
        box02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOver) {
                    if (AIGame) {
                        playerO.setTextColor(getResources().getColor(R.color.gray));
                        playerX.setTextColor(getResources().getColor(R.color.black));
                        if (playerTurn == 1 && box02.getText() == "") {
                            box02.setText("x");
                            isAIPlayed = false;
                            isWin();
                            AITurn();
                        } else {
                            AITurn();
                        }
                    } else if (!AIGame) {
                        if (box02.getText() == "") {
                            if (playerTurn == 1) {
                                box02.setText("x");
                                playerX.setTextColor(getResources().getColor(R.color.gray));
                                playerO.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 2;
                                isWin();
                            } else if (playerTurn == 2) {
                                box02.setText("o");
                                playerO.setTextColor(getResources().getColor(R.color.gray));
                                playerX.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 1;
                                isWin();
                            }
                        }
                    }
                }
            }
        });
        box10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOver) {
                    if (AIGame) {
                        playerO.setTextColor(getResources().getColor(R.color.gray));
                        playerX.setTextColor(getResources().getColor(R.color.black));
                        if (playerTurn == 1 && box00.getText() == "") {
                            box10.setText("x");
                            isAIPlayed = false;
                            isWin();
                            AITurn();
                        } else {
                            AITurn();
                        }
                    } else if (!AIGame) {
                        if (box10.getText() == "") {
                            if (playerTurn == 1) {
                                box10.setText("x");
                                playerX.setTextColor(getResources().getColor(R.color.gray));
                                playerO.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 2;
                                isWin();
                            } else if (playerTurn == 2) {
                                box10.setText("o");
                                playerO.setTextColor(getResources().getColor(R.color.gray));
                                playerX.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 1;
                                isWin();
                            }
                        }
                    }
                }
            }
        });
        box11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOver) {
                    if (AIGame) {
                        playerO.setTextColor(getResources().getColor(R.color.gray));
                        playerX.setTextColor(getResources().getColor(R.color.black));
                        if (playerTurn == 1 && box11.getText() == "") {
                            box11.setText("x");
                            isAIPlayed = false;
                            isWin();
                            AITurn();
                        } else {
                            AITurn();
                        }
                    } else if (!AIGame) {
                        if (box11.getText() == "") {
                            if (playerTurn == 1) {
                                box11.setText("x");
                                playerX.setTextColor(getResources().getColor(R.color.gray));
                                playerO.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 2;
                                isWin();
                            } else if (playerTurn == 2) {
                                box11.setText("o");
                                playerO.setTextColor(getResources().getColor(R.color.gray));
                                playerX.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 1;
                                isWin();
                            }
                        }
                    }
                }
            }
        });
        box12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOver) {
                    if (AIGame) {
                        playerO.setTextColor(getResources().getColor(R.color.gray));
                        playerX.setTextColor(getResources().getColor(R.color.black));
                        if (playerTurn == 1 && box12.getText() == "") {
                            box12.setText("x");
                            isAIPlayed = false;
                            isWin();
                            AITurn();
                        } else {
                            AITurn();
                        }
                    } else if (!AIGame) {
                        if (box12.getText() == "") {
                            if (playerTurn == 1) {
                                box12.setText("x");
                                playerX.setTextColor(getResources().getColor(R.color.gray));
                                playerO.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 2;
                                isWin();
                            } else if (playerTurn == 2) {
                                box12.setText("o");
                                playerO.setTextColor(getResources().getColor(R.color.gray));
                                playerX.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 1;
                                isWin();
                            }
                        }
                    }
                }
            }
        });
        box20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOver) {
                    if (AIGame) {
                        playerO.setTextColor(getResources().getColor(R.color.gray));
                        playerX.setTextColor(getResources().getColor(R.color.black));
                        if (playerTurn == 1 && box20.getText() == "") {
                            box20.setText("x");
                            isAIPlayed = false;
                            isWin();
                            AITurn();
                        } else {
                            AITurn();
                        }
                    } else if (!AIGame) {
                        if (box20.getText() == "") {
                            if (playerTurn == 1) {
                                box20.setText("x");
                                playerX.setTextColor(getResources().getColor(R.color.gray));
                                playerO.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 2;
                                isWin();
                            } else if (playerTurn == 2) {
                                box20.setText("o");
                                playerO.setTextColor(getResources().getColor(R.color.gray));
                                playerX.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 1;
                                isWin();
                            }
                        }
                    }
                }
            }
        });
        box21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOver) {
                    if (AIGame) {
                        playerO.setTextColor(getResources().getColor(R.color.gray));
                        playerX.setTextColor(getResources().getColor(R.color.black));
                        if (playerTurn == 1 && box21.getText() == "") {
                            box21.setText("x");
                            isAIPlayed = false;
                            isWin();
                            AITurn();
                        } else {
                            AITurn();
                        }
                    } else if (!AIGame) {
                        if (box21.getText() == "") {
                            if (playerTurn == 1) {
                                box21.setText("x");
                                playerX.setTextColor(getResources().getColor(R.color.gray));
                                playerO.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 2;
                                isWin();
                            } else if (playerTurn == 2) {
                                box21.setText("o");
                                playerO.setTextColor(getResources().getColor(R.color.gray));
                                playerX.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 1;
                                isWin();
                            }
                        }
                    }
                }
            }
        });
        box22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isOver) {
                    if (AIGame) {
                        playerO.setTextColor(getResources().getColor(R.color.gray));
                        playerX.setTextColor(getResources().getColor(R.color.black));
                        if (playerTurn == 1 && box22.getText() == "") {
                            box22.setText("x");
                            isAIPlayed = false;
                            isWin();
                            AITurn();
                        } else {
                            AITurn();
                        }
                    } else if (!AIGame) {
                        if (box22.getText() == "") {
                            if (playerTurn == 1) {
                                box22.setText("x");
                                playerX.setTextColor(getResources().getColor(R.color.gray));
                                playerO.setTextColor(getResources().getColor(R.color.black));
                                playerTurn = 2;
                                isWin();
                            } else if (playerTurn == 2) {
                                box22.setText("o");
                                playerO.setTextColor(getResources().getColor(R.color.black));
                                playerX.setTextColor(getResources().getColor(R.color.gray));
                                playerTurn = 1;
                                isWin();
                            }
                        }
                    }
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isOver = false;
                resetGame();
                Toast.makeText(MainActivity.this, "Reset completed", Toast.LENGTH_SHORT).show();
            }
        });

        resetScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreX = 0;
                scoreO = 0;
                setScore();
                Toast.makeText(MainActivity.this, "Reset Completed", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void setScore() {
        scoreXText.setText("" + scoreX);
        scoreOText.setText("" + scoreO);
    }

    public void resetGame() {
        if (winner == 1) {
            playerTurn = 2;
        } else if (winner == 2) {
            playerTurn = 1;
        }
        box00.setText("");
        box01.setText("");
        box02.setText("");
        box10.setText("");
        box11.setText("");
        box12.setText("");
        box20.setText("");
        box21.setText("");
        box22.setText("");
    }


    public void isWin() {
        String text00 = (String) box00.getText();
        String text01 = (String) box01.getText();
        String text02 = (String) box02.getText();
        String text10 = (String) box10.getText();
        String text11 = (String) box11.getText();
        String text12 = (String) box12.getText();
        String text20 = (String) box20.getText();
        String text21 = (String) box21.getText();
        String text22 = (String) box22.getText();
        if (text00 == text01 && text01 == text02) {
            if (text02 == "x") {
                showToast("X");
            } else if (text02 == "o") {
                showToast("O");
            }
        } else if (text10 == text11 && text11 == text12) {
            if (text12 == "x") {
                showToast("X");
            } else if (text12 == "o") {
                showToast("O");
            }
        } else if (text20 == text21 && text21 == text22) {
            if (text22 == "x") {
                showToast("X");
            } else if (text22 == "o") {
                showToast("O");
            }
        } else if (text00 == text10 && text10 == text20) {
            if (text20 == "x") {
                showToast("X");
            } else if (text20 == "o") {
                showToast("O");
            }
        } else if (text01 == text11 && text11 == text21) {
            if (text21 == "x") {
                showToast("X");
            } else if (text21 == "o") {
                showToast("O");
            }
        } else if (text02 == text12 && text12 == text22) {
            if (text22 == "x") {
                showToast("X");
            } else if (text22 == "o") {
                showToast("O");
            }
        } else if (text00 == text11 && text11 == text22) {
            if (text22 == "x") {
                showToast("X");
            } else if (text22 == "o") {
                showToast("O");
            }
        } else if (text02 == text11 && text11 == text20) {
            if (text20 == "x") {
                showToast("X");
            } else if (text20 == "o") {
                showToast("O");
            }
        }
    }

    public void showToast(String s) {
        isOver = true;
        if (s == "X") {
            scoreX++;
        } else if (s == "O") {
            scoreO++;
        }
        setScore();
        Toast.makeText(this, "Player " + s + " won the game", Toast.LENGTH_SHORT).show();
    }

    public void showGameOverToast() {
        Toast.makeText(this, "Game over. Click reset to replay.", Toast.LENGTH_LONG).show();
    }

    public void changePlayerTextColor() {
        if (playerTurn == 1) {
            playerO.setTextColor(getResources().getColor(R.color.gray));
            playerX.setTextColor(getResources().getColor(R.color.black));
        } else if (playerTurn == 2) {
            playerX.setTextColor(getResources().getColor(R.color.gray));
            playerO.setTextColor(getResources().getColor(R.color.black));
        }
    }

    public void AITurn() {
        int random;
        while (!isAIPlayed) {
            random = (int) (Math.floor(Math.random() * 10) + 1);
            Log.v("Random: ", "" + random);
            if (box00.getText() != "" || box01.getText() != "" || box02.getText() != "" || box10.getText() != ""
                    || box11.getText() != "" || box12.getText() != "" || box20.getText() != "" || box21.getText() != "" || box22.getText() != "") {
                if (random == 1 && box00.getText() == "") {
                    box00.setText("o");
                    isAIPlayed = true;
                } else if (random == 2 && box01.getText() == "") {
                    box01.setText("o");
                    isAIPlayed = true;
                } else if (random == 3 && box02.getText() == "") {
                    box02.setText("o");
                    isAIPlayed = true;
                } else if (random == 4 && box10.getText() == "") {
                    box10.setText("o");
                    isAIPlayed = true;
                } else if (random == 5 && box11.getText() == "") {
                    box11.setText("o");
                    isAIPlayed = true;
                } else if (random == 6 && box12.getText() == "") {
                    box12.setText("o");
                    isAIPlayed = true;
                } else if (random == 7 && box20.getText() == "") {
                    box20.setText("o");
                    isAIPlayed = true;
                } else if (random == 8 && box21.getText() == "") {
                    box21.setText("o");
                    isAIPlayed = true;
                } else if (random == 9 && box22.getText() == "") {
                    box22.setText("o");
                    isAIPlayed = true;
                }
            } else {
                box11.setText("o");
                isAIPlayed = true;
            }
        }
        playerTurn = 1;
        isWin();
    }
}
