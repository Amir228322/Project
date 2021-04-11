package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class italian_practice extends AppCompatActivity {
    int pawn_move;
    int bishop_move;
    int rook_move;
    int queen_move;
    int knight_move;
    int king_move;
    int count = 0;
    int correct_moves[] = new int[64];
    ImageButton buttons[] = new ImageButton[64];

    boolean pawn_active = false;
    boolean rook_active = false;
    boolean knight_active = false;
    boolean bishop_active = false;
    boolean queen_active = false;
    boolean king_active = false;
    boolean pawn_moves = false;
    boolean rook_moves = false;
    boolean knight_moves = false;
    boolean bishop_moves = false;
    boolean queen_moves = false;
    boolean king_moves = false;

    int field[] = new int [64];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_practice);
        getSupportActionBar().hide();
        for(int i = 0; i <= 63; i++){
            field[i] = 7;
        }
        correct_moves[0] = 35;  correct_moves[1] = 42;  correct_moves[2] = 19;

        field[0] = 5;   field[1] = 1;   field[8] = 2;   field[9] = 1;
        field[16] = 3;  field[17] = 1;  field[24] = 4;  field[25] = 1;
        field[32] = 6;  field[33] = 1;  field[40] = 3;  field[41] = 1;
        field[48] = 2;  field[49] = 1;  field[56] = 5;  field[57] = 1;
        field[6] = 8;   field[7] = 8;   field[14] = 8;  field[15] = 8;
        field[22] = 8;  field[23] = 8;  field[30] = 8;  field[31] = 8;
        field[38] = 8;  field[39] = 8;  field[46] = 8;  field[47] = 8;
        field[54] = 8;  field[55] = 8;  field[62] = 8;  field[63] = 8;
        buttons[0] = (ImageButton)findViewById(R.id.a1); buttons[1] = (ImageButton)findViewById(R.id.a2);
        buttons[2] = (ImageButton)findViewById(R.id.a3); buttons[3] = (ImageButton)findViewById(R.id.a4);
        buttons[4] = (ImageButton)findViewById(R.id.a5); buttons[5] = (ImageButton)findViewById(R.id.a6);
        buttons[6] = (ImageButton)findViewById(R.id.a7); buttons[7] = (ImageButton)findViewById(R.id.a8);

        buttons[8] = (ImageButton)findViewById(R.id.b1); buttons[9] = (ImageButton)findViewById(R.id.b2);
        buttons[10] = (ImageButton)findViewById(R.id.b3); buttons[11] = (ImageButton)findViewById(R.id.b4);
        buttons[12] = (ImageButton)findViewById(R.id.b5); buttons[13] = (ImageButton)findViewById(R.id.b6);
        buttons[14] = (ImageButton)findViewById(R.id.b7); buttons[15] = (ImageButton)findViewById(R.id.b8);

        buttons[16] = (ImageButton)findViewById(R.id.c1); buttons[17] = (ImageButton)findViewById(R.id.c2);
        buttons[18] = (ImageButton)findViewById(R.id.c3); buttons[19] = (ImageButton)findViewById(R.id.c4);
        buttons[20] = (ImageButton)findViewById(R.id.c5); buttons[21] = (ImageButton)findViewById(R.id.c6);
        buttons[22] = (ImageButton)findViewById(R.id.c7); buttons[23] = (ImageButton)findViewById(R.id.c8);

        buttons[24] = (ImageButton)findViewById(R.id.d1); buttons[25] = (ImageButton)findViewById(R.id.d2);
        buttons[26] = (ImageButton)findViewById(R.id.d3); buttons[27] = (ImageButton)findViewById(R.id.d4);
        buttons[28] = (ImageButton)findViewById(R.id.d5); buttons[29] = (ImageButton)findViewById(R.id.d6);
        buttons[30] = (ImageButton)findViewById(R.id.d7); buttons[31] = (ImageButton)findViewById(R.id.d8);

        buttons[32] = (ImageButton)findViewById(R.id.e1); buttons[33] = (ImageButton)findViewById(R.id.e2);
        buttons[34] = (ImageButton)findViewById(R.id.e3); buttons[35] = (ImageButton)findViewById(R.id.e4);
        buttons[36] = (ImageButton)findViewById(R.id.e5); buttons[37] = (ImageButton)findViewById(R.id.e6);
        buttons[38] = (ImageButton)findViewById(R.id.e7); buttons[39] = (ImageButton)findViewById(R.id.e8);

        buttons[40] = (ImageButton)findViewById(R.id.f1); buttons[41] = (ImageButton)findViewById(R.id.f2);
        buttons[42] = (ImageButton)findViewById(R.id.f3); buttons[43] = (ImageButton)findViewById(R.id.f4);
        buttons[44] = (ImageButton)findViewById(R.id.f5); buttons[45] = (ImageButton)findViewById(R.id.f6);
        buttons[46] = (ImageButton)findViewById(R.id.f7); buttons[47] = (ImageButton)findViewById(R.id.f8);

        buttons[48] = (ImageButton)findViewById(R.id.g1); buttons[49] = (ImageButton)findViewById(R.id.g2);
        buttons[50] = (ImageButton)findViewById(R.id.g3); buttons[51] = (ImageButton)findViewById(R.id.g4);
        buttons[52] = (ImageButton)findViewById(R.id.g5); buttons[53] = (ImageButton)findViewById(R.id.g6);
        buttons[54] = (ImageButton)findViewById(R.id.g7); buttons[55] = (ImageButton)findViewById(R.id.g8);

        buttons[56] = (ImageButton)findViewById(R.id.h1); buttons[57] = (ImageButton)findViewById(R.id.h2);
        buttons[58] = (ImageButton)findViewById(R.id.h3); buttons[59] = (ImageButton)findViewById(R.id.h4);
        buttons[60] = (ImageButton)findViewById(R.id.h5); buttons[61] = (ImageButton)findViewById(R.id.h6);
        buttons[62] = (ImageButton)findViewById(R.id.h7); buttons[63] = (ImageButton)findViewById(R.id.h8);
    }
    public void undoforall(int place) {
        if(field[place] == 1) {
            field[pawn_move] = 1;
            field[place] = 7;
            buttons[pawn_move].setForeground(getDrawable(R.drawable.piece_2));
            buttons[place].setForeground(null);
        } else if (field[place] == 2) {
            field[knight_move] = 2;
            field[place] = 7;
            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
            buttons[place].setForeground(null);
        } else if (field[place] == 3) {
            field[bishop_move] = 3;
            field[place] = 7;
            buttons[bishop_move].setForeground(getDrawable(R.drawable.piece_7));
            buttons[place].setForeground(null);
        } else if (field[place] == 4) {
            field[queen_move] = 4;
            field[place] = 7;
            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
            buttons[place].setForeground(null);
        } else if (field[place] == 5) {
            field[rook_move] = 5;
            field[place] = 7;
            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
            buttons[place].setForeground(null);
        } else if (field[place] == 6) {
            field[king_move] = 6;
            field[place] = 7;
            buttons[king_move].setForeground(getDrawable(R.drawable.piece_6));
            buttons[place].setForeground(null);
        }
    }
    public void getPlace(int tags) {
        int place = tags;
        tags = field[tags];
        if (tags == 1) {
            pawn_moves = true;
            if (rook_moves == true) {
                rook_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                knight_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                bishop_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                queen_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (king_moves == true) {
                king_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (pawn_active == true) {
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (pawn_moves == true) {
                pawn_move = place;
                place += 1;
                if (place > 0 || place < 63) {
                    if (field[place] == 7) {
                        buttons[place].setForeground(getDrawable(R.drawable.greycircle));
                        field[place] = 0;
                    }
                }
                place += 1;
                if (place > 0 || place < 63) {
                    if (field[place] == 7) {
                        buttons[place].setForeground(getDrawable(R.drawable.greycircle));
                        field[place] = 0;
                    }
                }
                pawn_active = true;
                if (knight_active == true) {
                    knight_active = false;
                }
                if (king_active == true) {
                    king_active = false;
                }
                if (bishop_active == true) {
                    bishop_active = false;
                }
                if (queen_active == true) {
                    queen_active = false;
                }
                if (rook_active == true) {
                    rook_active = false;
                }
            }
        }
        if (tags == 2) {
            int kn = place;
            knight_move = place;
            knight_moves = true;
            if (pawn_moves == true) {
                pawn_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (rook_moves == true) {
                rook_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                bishop_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                queen_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (king_moves == true) {
                king_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                kn += 10;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn -= 6;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn += 17;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn += 15;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn -= 15;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn -= 17;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn -= 10;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                kn = place;
                kn += 6;
                if (kn > 0 && kn < 63) {
                    if (field[kn] == 7) {
                        buttons[kn].setForeground(getDrawable(R.drawable.greycircle));
                        field[kn] = 0;
                    }
                }
                knight_active = true;
                if (pawn_active == true) {
                    pawn_active = false;
                }
                if (king_active == true) {
                    king_active = false;
                }
                if (bishop_active == true) {
                    bishop_active = false;
                }
                if (queen_active == true) {
                    queen_active = false;
                }
                if (rook_active == true) {
                    rook_active = false;
                }
            }

        }
        if (tags == 3) {
            int k = place;
            bishop_move = place;
            bishop_moves = true;
            if (pawn_moves == true) {
                pawn_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (rook_moves == true) {
                rook_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                knight_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                queen_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (king_moves == true) {
                king_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                k += 9;
                if (k <= 63) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k += 9;
                        if (k > 63) {
                            break;
                        }
                    }
                }
                k = place;
                k -= 7;
                if (k >= 0) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k -= 7;
                        if (k < 0) {
                            break;
                        }
                    }
                }
                k = place;
                k += 7;
                if (k <= 63) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k += 7;
                        if (k > 63) {
                            break;
                        }
                    }
                }
                k = place;
                k -= 9;
                if (k >= 0) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k -= 9;
                        if (k < 0) {
                            break;
                        }
                    }
                }
                bishop_active = true;
                if (pawn_active == true) {
                    pawn_active = false;
                }
                if (king_active == true) {
                    king_active = false;
                }
                if (knight_active == true) {
                    knight_active = false;
                }
                if (queen_active == true) {
                    queen_active = false;
                }
                if (rook_active == true) {
                    rook_active = false;
                }
            }

        }
        if (tags == 4) {
            int k = place;
            queen_move = place;
            queen_moves = true;
            if (pawn_moves == true) {
                pawn_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (rook_moves == true) {
                rook_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                knight_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                bishop_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }

            if (king_moves == true) {
                king_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                k += 9;
                if (k <= 63) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k += 9;
                        if (k > 63) {
                            break;
                        }
                    }
                }
                k = place;
                k -= 7;
                if (k >= 0) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k -= 7;
                        if (k < 0) {
                            break;
                        }
                    }
                }
                k = place;
                k += 7;
                if (k <= 63) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k += 7;
                        if (k > 63) {
                            break;
                        }
                    }
                }
                k = place;
                k -= 9;
                if (k >= 0) {
                    while (field[k] == 7) {
                        buttons[k].setForeground(getDrawable(R.drawable.greycircle));
                        field[k] = 0;
                        k -= 9;
                        if (k < 0) {
                            break;
                        }
                    }
                }
                int r = place;
                r += 1;
                if (r < 63) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r += 1;
                        if (r > 63) {
                            break;
                        }
                    }
                }
                r = place;
                r -= 1;
                if (r > 0) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r -= 1;
                        if (r < 0) {
                            break;
                        }
                    }
                }
                r = place;
                r += 8;
                if (r < 55) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r += 8;
                        if (r > 63) {
                            break;
                        }
                    }
                }
                r = place;
                r -= 8;
                if (r >= 8) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r -= 8;
                        if (r <= 0) {
                            break;
                        }
                    }
                }
                queen_active = true;
                if (pawn_active == true) {
                    pawn_active = false;
                }
                if (king_active == true) {
                    king_active = false;
                }
                if (knight_active == true) {
                    knight_active = false;
                }
                if (bishop_active == true) {
                    bishop_active = false;
                }
                if (rook_active == true) {
                    rook_active = false;
                }
            }
        }
        if (tags == 5) {
            int r = place;
            rook_move = place;
            rook_moves = true;
            if (pawn_moves == true) {
                pawn_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (rook_moves == true) {
                rook_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                knight_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                bishop_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                queen_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (king_moves == true) {
                king_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (rook_moves == true) {
                r += 1;
                if (r < 63) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r += 1;
                        if (r > 63) {
                            break;
                        }
                    }
                }
                r = place;
                r -= 1;
                if (r > 0) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r -= 1;
                        if (r < 0) {
                            break;
                        }
                    }
                }
                r = place;
                r += 8;
                if (r < 55) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r += 8;
                        if (r > 63) {
                            break;
                        }
                    }
                }
                r = place;
                r -= 8;
                if (r >= 8) {
                    while (field[r] == 7) {
                        buttons[r].setForeground(getDrawable(R.drawable.greycircle));
                        field[r] = 0;
                        r -= 8;
                        if (r <= 0) {
                            break;
                        }
                    }
                }
                rook_active = true;
                if (pawn_active == true) {
                    pawn_active = false;
                }
                if (king_active == true) {
                    king_active = false;
                }
                if (knight_active == true) {
                    knight_active = false;
                }
                if (bishop_active == true) {
                    bishop_active = false;
                }
                if (queen_active == true) {
                    queen_active = false;
                }
            }
        }
        if (tags == 6) {
            int kng = place;
            king_move = place;
            king_moves = true;
            if (pawn_moves == true) {
                pawn_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (knight_moves == true) {
                knight_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (bishop_moves == true) {
                bishop_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (queen_moves == true) {
                queen_moves = false;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
            }
            if (king_moves == true) {
                kng += 1;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng -= 1;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng += 7;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng -= 7;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng += 8;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                        if (kng + 8 <= 63) {
                            if (field[kng + 8] == 7) {
                                buttons[kng + 8].setForeground(getDrawable(R.drawable.greycircle));
                                field[kng + 8] = 0;
                            }
                        }
                    }
                }
                kng = place;
                kng -= 8;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng += 9;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                kng = place;
                kng -= 9;
                if (kng > 0 && kng < 63) {
                    if (field[kng] == 7) {
                        buttons[kng].setForeground(getDrawable(R.drawable.greycircle));
                        field[kng] = 0;
                    }
                }
                king_active = true;
                if (pawn_active == true) {
                    pawn_active = false;
                }
                if (rook_active == true) {
                    rook_active = false;
                }
                if (knight_active == true) {
                    knight_active = false;
                }
                if (bishop_active == true) {
                    bishop_active = false;
                }
                if (queen_active == true) {
                    queen_active = false;
                }
            }

        }
        if (tags == 0) {
            if (pawn_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_2));
                field[place] = 1;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                if (field[place - 1] == 1) {
                    buttons[place - 1].setForeground(null);
                    field[place - 1] = 7;
                } else if (field[place - 2] == 1) {
                    buttons[place - 2].setForeground(null);
                    field[place - 2] = 7;
                }
                pawn_active = false;
            }
            if (knight_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_6));
                field[place] = 2;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                buttons[knight_move].setForeground(null);
                field[knight_move] = 7;
                knight_active = false;
            }
            if (bishop_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_7));
                field[place] = 3;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                int k = bishop_move;
                buttons[bishop_move].setForeground(null);
                field[bishop_move] = 7;
                bishop_active = false;
            }
            if (queen_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_10));
                field[place] = 4;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                buttons[queen_move].setForeground(null);
                field[queen_move] = 7;
                queen_active = false;
            }
            if (rook_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_4));
                field[place] = 5;
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                buttons[rook_move].setForeground(null);
                field[rook_move] = 7;
                rook_active = false;
            }
            if (king_active == true) {
                buttons[place].setForeground(getDrawable(R.drawable.piece_11));
                field[place] = 6;
                if (field[place + 8] == 5) {
                    field[place + 8] = 7;
                    buttons[place + 8].setForeground(null);
                    buttons[place - 8].setForeground(getDrawable(R.drawable.piece_4));
                    field[place - 8] = 5;
                }
                for (int i = 0; i <= 63; i++) {
                    if (field[i] == 0) {
                        buttons[i].setForeground(null);
                        field[i] = 7;
                    }
                }
                buttons[king_move].setForeground(null);
                field[king_move] = 7;
                king_active = false;
            }
            switch (count) {
                case 0:
                    if (place == correct_moves[count]) {
                        if (field[place] == 1) {
                            count++;
                        } else if(field[place] == 2) {
                            field[knight_move] = 2;
                            field[place] = 7;
                            buttons[knight_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 3){
                            field[bishop_move] = 3;
                            field[place] = 7;
                            buttons[bishop_move].setForeground(getDrawable(R.drawable.piece_7));
                            buttons[place].setForeground(null);
                    }else if (field[place] == 4){
                            field[queen_move] = 4;
                            field[place] = 7;
                            buttons[queen_move].setForeground(getDrawable(R.drawable.piece_10));
                            buttons[place].setForeground(null);
                        }else if (field[place] == 5){
                            field[rook_move] = 5;
                            field[place] = 7;
                            buttons[rook_move].setForeground(getDrawable(R.drawable.piece_4));
                            buttons[place].setForeground(null);
                        }else if(field[place] == 6){
                            field[king_move] = 6;
                            field[place] = 7;
                            buttons[king_move].setForeground(getDrawable(R.drawable.piece_6));
                            buttons[place].setForeground(null);
                        }
                } else undoforall(place);

            }
        }
    }
    public void onCLick_Italian_Practice_a1(View view) {
        int i = Integer.parseInt((String) buttons[0].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a2(View view) {
        int i = Integer.parseInt((String) buttons[1].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a3(View view) {
        int i = Integer.parseInt((String) buttons[2].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a4(View view) {
        int i = Integer.parseInt((String) buttons[3].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a5(View view) {
        int i = Integer.parseInt((String) buttons[4].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a6(View view) {
        int i = Integer.parseInt((String) buttons[5].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_a7(View view) {
        int i = Integer.parseInt((String) buttons[6].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b1(View view) {
        int i = Integer.parseInt((String) buttons[8].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b2(View view) {
        int i = Integer.parseInt((String) buttons[9].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b3(View view) {
        int i = Integer.parseInt((String) buttons[10].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b4(View view) {
        int i = Integer.parseInt((String) buttons[11].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b5(View view) {
        int i = Integer.parseInt((String) buttons[12].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b6(View view) {
        int i = Integer.parseInt((String) buttons[13].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_b7(View view) {
        int i = Integer.parseInt((String) buttons[14].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c1(View view) {
        int i = Integer.parseInt((String) buttons[16].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c2(View view) {
        int i = Integer.parseInt((String) buttons[17].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c3(View view) {
        int i = Integer.parseInt((String) buttons[18].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c4(View view) {
        int i = Integer.parseInt((String) buttons[19].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c5(View view) {
        int i = Integer.parseInt((String) buttons[20].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c6(View view) {
        int i = Integer.parseInt((String) buttons[21].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_c7(View view) {
        int i = Integer.parseInt((String) buttons[22].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d1(View view) {
        int i = Integer.parseInt((String) buttons[24].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d2(View view) {
        int i = Integer.parseInt((String) buttons[25].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d3(View view) {
        int i = Integer.parseInt((String) buttons[26].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d4(View view) {
        int i = Integer.parseInt((String) buttons[27].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d5(View view) {
        int i = Integer.parseInt((String) buttons[28].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d6(View view) {
        int i = Integer.parseInt((String) buttons[29].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_d7(View view) {
        int i = Integer.parseInt((String) buttons[30].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e1(View view) {
        int i = Integer.parseInt((String) buttons[32].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e2(View view) {
        int i = Integer.parseInt((String) buttons[33].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e3(View view) {
        int i = Integer.parseInt((String) buttons[34].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e4(View view) {
        int i = Integer.parseInt((String) buttons[35].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e5(View view) {
        int i = Integer.parseInt((String) buttons[36].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e6(View view) {
        int i = Integer.parseInt((String) buttons[37].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_e7(View view) {
        int i = Integer.parseInt((String) buttons[38].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f1(View view) {
        int i = Integer.parseInt((String) buttons[40].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f2(View view) {
        int i = Integer.parseInt((String) buttons[41].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f3(View view) {
        int i = Integer.parseInt((String) buttons[42].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f4(View view) {
        int i = Integer.parseInt((String) buttons[43].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f5(View view) {
        int i = Integer.parseInt((String) buttons[44].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f6(View view) {
        int i = Integer.parseInt((String) buttons[45].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_f7(View view) {
        int i = Integer.parseInt((String) buttons[46].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g1(View view) {
        int i = Integer.parseInt((String) buttons[48].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g2(View view) {
        int i = Integer.parseInt((String) buttons[49].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g3(View view) {
        int i = Integer.parseInt((String) buttons[50].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g4(View view) {
        int i = Integer.parseInt((String) buttons[51].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g5(View view) {
        int i = Integer.parseInt((String) buttons[52].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g6(View view) {
        int i = Integer.parseInt((String) buttons[53].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_g7(View view) {
        int i = Integer.parseInt((String) buttons[54].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h1(View view) {
        int i = Integer.parseInt((String) buttons[56].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h2(View view) {
        int i = Integer.parseInt((String) buttons[57].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h3(View view) {
        int i = Integer.parseInt((String) buttons[58].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h4(View view) {
        int i = Integer.parseInt((String) buttons[59].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h5(View view) {
        int i = Integer.parseInt((String) buttons[60].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h6(View view) {
        int i = Integer.parseInt((String) buttons[61].getTag());
        getPlace(i);
    }
    public void onCLick_Italian_Practice_h7(View view) {
        int i = Integer.parseInt((String) buttons[62].getTag());
        getPlace(i);
    }
}