package com.maxbassoul.app.myjumper.com.maxbassoul.app.myjumper.graficos;

import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by Diego on 07/12/2015.
 */
public class Cores{
    public static Paint getCorDoPassaro(){
        Paint vermelho = new Paint();
        vermelho.setColor(0xFFFF0000);
        return vermelho;
    }
    public static Paint getCorDoCano(){
        Paint branco = new Paint();
        branco.setColor(0xFFFFFFFF);
        return branco;
    }
    public static Paint getCorDaPontuacao(){
        Paint branco = new Paint();
        branco.setTextSize(80);
        branco.setColor(0xFFFFFFFF);
        branco.setTypeface(Typeface.DEFAULT_BOLD);
        branco.setShadowLayer(3, 5, 5, 0xFF000000);
        return branco;
    }
    public static Paint getCorDoGameOver(){
        Paint branco = new Paint();
        branco.setColor(0xFFFFFFFF);
        branco.setTextSize(50);
        branco.setTypeface(Typeface.DEFAULT_BOLD);
        branco.setShadowLayer(2, 3, 3, 0xFFFFFFFF);
        return branco;
    }
}
