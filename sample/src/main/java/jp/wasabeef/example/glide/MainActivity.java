package jp.wasabeef.example.glide;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import butterknife.BindView;
import butterknife.ButterKnife;
import jp.wasabeef.glide.transformations.BlurTransformation;
import jp.wasabeef.glide.transformations.ColorFilterTransformation;
import jp.wasabeef.glide.transformations.GrayscaleTransformation;
import jp.wasabeef.glide.transformations.gpu.BrightnessFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.ContrastFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.InvertFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.KuwaharaFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.PixelationFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SepiaFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SketchFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.SwirlFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.ToonFilterTransformation;
import jp.wasabeef.glide.transformations.gpu.VignetteFilterTransformation;

import static com.bumptech.glide.request.RequestOptions.bitmapTransform;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.image0)
    ImageView image0;
    @BindView(R.id.image1)
    ImageView image1;
    @BindView(R.id.image2)
    ImageView image2;
    @BindView(R.id.image3)
    ImageView image3;
    @BindView(R.id.image4)
    ImageView image4;
    @BindView(R.id.image5)
    ImageView image5;
    @BindView(R.id.image6)
    ImageView image6;
    @BindView(R.id.image7)
    ImageView image7;
    @BindView(R.id.image8)
    ImageView image8;
    @BindView(R.id.image9)
    ImageView image9;
    @BindView(R.id.image10)
    ImageView image10;
    @BindView(R.id.image11)
    ImageView image11;
    @BindView(R.id.image12)
    ImageView image12;
    @BindView(R.id.image13)
    ImageView image13;
    @BindView(R.id.image14)
    ImageView image14;
    @BindView(R.id.image15)
    ImageView image15;
    @BindView(R.id.image16)
    ImageView image16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        RequestOptions options = new RequestOptions()
                .fitCenter()
                .dontAnimate()
                .placeholder(android.R.color.darker_gray)
                .error(android.R.color.darker_gray)
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.test)
                .into(image0);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .into(image1);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.test2)
                .into(image15);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo1)
                .into(image16);
        //--------------------------------------------------

        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo1)
                .apply(bitmapTransform(new ContrastFilterTransformation(1.8f)))
                .apply(bitmapTransform(new BrightnessFilterTransformation(-0.1f)))
                .into(image2);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new GrayscaleTransformation()))
                .into(image3);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new BlurTransformation(25)))
                .into(image4);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new ToonFilterTransformation()))
                .into(image5);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new SepiaFilterTransformation()))
                .into(image6);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new ColorFilterTransformation(Color.argb(80, 255, 0, 0))))
                .into(image7);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new InvertFilterTransformation()))
                .into(image8);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new PixelationFilterTransformation(20)))
                .into(image9);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new SketchFilterTransformation()))
                .into(image10);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(
                        new SwirlFilterTransformation(0.5f, 1.0f, new PointF(0.5f, 0.5f))).dontAnimate())
                .into(image11);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new BrightnessFilterTransformation(0.5f)).dontAnimate())
                .into(image12);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new KuwaharaFilterTransformation(25)).dontAnimate())
                .into(image13);
        Glide.with(this)
                .setDefaultRequestOptions(options)
                .load(R.drawable.demo)
                .apply(bitmapTransform(new VignetteFilterTransformation(new PointF(0.5f, 0.5f),
                        new float[]{0.0f, 0.0f, 0.0f}, 0f, 0.75f)).dontAnimate())
                .into(image14);

    }
}
