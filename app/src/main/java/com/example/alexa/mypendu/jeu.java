package com.example.alexa.mypendu;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by alexa on 26/01/2018.
 */

public class jeu extends AppCompatActivity
{
    private ImageView barre, tige, tigehaute, triangle, corde, tete, corps, bg, bd, pg, pd;
    private Button button, button2, button3, button4, button5, button6, button7, button8, button9;
    private Button button10, button11, button12, button13, button14, button15, button16, button17;
    private Button button18, button19, button20, button21, button22, button23, button24, button25;
    private Button button26;
    private int i, vie, r;
    private char c;
    private String str, fin, str1, str2;
    private String tab[] = {"BAC", "TOP", "VOITURE", "ARBUSTE", "TERMINAL"};
    private TextView TV, Life;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeu);
        r = rando();
        str = tab[r];
        fin = "";
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button12 = findViewById(R.id.button12);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);
        button16 = findViewById(R.id.button16);
        button17 = findViewById(R.id.button17);
        button18 = findViewById(R.id.button18);
        button19 = findViewById(R.id.button19);
        button20 = findViewById(R.id.button20);
        button21 = findViewById(R.id.button21);
        button22 = findViewById(R.id.button22);
        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        barre = findViewById(R.id.barre);
        tige = findViewById(R.id.tige);
        tigehaute = findViewById(R.id.tigehaute);
        triangle = findViewById(R.id.triangle);
        corde = findViewById(R.id.corde);
        tete = findViewById(R.id.tete);
        corps = findViewById(R.id.corps);
        bg = findViewById(R.id.bg);
        bd = findViewById(R.id.bd);
        pg = findViewById(R.id.pg);
        pd = findViewById(R.id.pd);
        TV = findViewById(R.id.TV);
        Life = findViewById(R.id.Life);
        vie = 11;
        Life.setText("Il vous reste 11 vie !");
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'A';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'B';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button2.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'C';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button3.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'D';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button4.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'E';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button5.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'F';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button6.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'G';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button7.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'H';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button8.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'I';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button9.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'J';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button10.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'K';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button11.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'L';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button12.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'M';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button13.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'N';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button14.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'O';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button15.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'P';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button16.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button17.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'Q';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button17.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'R';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button18.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button19.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'S';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button19.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'T';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button20.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button21.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'U';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button21.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button22.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'V';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button22.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button23.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'W';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button23.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button24.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'X';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button24.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button25.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'Y';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button20.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        button26.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                i = 0;
                c = 'Z';
                while (i < str.length())
                {
                    if (str.charAt(i) == c)
                    {
                        pop(c);
                        fin = fin + c;
                        str1 = str.substring(0, (i));
                        str2 = str.substring((i + 1), str.length());
                        str = str1 + str2;
                        TV.setText(fin);
                        button26.setEnabled(false);
                        if (str.length() == 0)
                        {
                            pop1("GG ! You are not dead !");
                            Intent intent = new Intent(jeu.this, intro.class);
                            startActivity(intent);
                            finish();
                        }
                        return;
                    }
                    i++;
                }
                pop1("Wrong letter !");
                vie = vie - 1;
                life(vie);
                Life.setText("Il vous reste " + vie + " vie !");
                if (vie == 0)
                {
                    pop1("YOU ARE DEAD !");
                    Intent intent = new Intent(jeu.this, intro.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

    }

    public void pop(char str)
    {
        Context context = getApplicationContext();
        CharSequence text = "You have found the letter " + str + " !";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void pop1(String str)
    {
        Context context = getApplicationContext();
        CharSequence text = "" + str;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public int life(int l)
    {
        if (l == 10)
        {
            barre.setVisibility(View.VISIBLE);
        }
        else if (l == 9)
        {
            tige.setVisibility(View.VISIBLE);
        }
        else if (l == 8)
        {
            tigehaute.setVisibility(View.VISIBLE);
        }
        else if (l == 7)
        {
            triangle.setVisibility(View.VISIBLE);
        }
        else if (l == 6)
        {
            corde.setVisibility(View.VISIBLE);
        }
        else if (l == 5)
        {
            corde.setVisibility(View.INVISIBLE);
            tete.setVisibility(View.VISIBLE);
        }
        else if (l == 4)
        {
            corps.setVisibility(View.VISIBLE);
        }
        else if (l == 3)
        {
            bg.setVisibility(View.VISIBLE);
        }
        else if (l == 2)
        {
            bd.setVisibility(View.VISIBLE);
        }
        else if (l == 1)
        {
            pg.setVisibility(View.VISIBLE);
        }
        else if(l == 0)
        {
            pd.setVisibility(View.VISIBLE);
        }
        return l;
    }

    public int rando()
    {
        int i = 0;
        i = (int) (Math.random() * ( 5 - 0));
        return i;
    }
}
