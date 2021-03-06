# Material Components - Theming

Material Theming refers to the customization of your Material Design app to reflect your product’s brand

    dependencies {
        ...
        implementation 'com.google.android.material:material:1.1.0-alpha01'
        ...
    }

## Color system

The Material Design color system uses an organized approach to applying color to your UI. In this system, two theme colors are selected to express different parts of a UI: a primary color and a secondary color. Material components use these theme colors and their variations to style their individual backgrounds, text, and more.

### Usage
```xml
<style name="AppTheme" parent="Theme.MaterialComponents.Light.NoActionBar">
  <item name="colorPrimary">...</item>
  ...
</style>
```

| Attribute  | Definition |
| ------------- | ------------- |
| colorPrimary  | Color displayed most frequently across your app’s screens and components. The button color is the color primary. |
| colorPrimaryDark  | Color displayed in Status Bar if statusBarColor attribute is not defined. |
| colorSecondary | Color used in FAB, checkboxes, switches ... |
| colorOnPrimary | Color of text and icons in colored components as Buttons and BottomNavigationView. |
| colorOnSecondary | Color of text and icons in colored secondary components as FAB ... |
| colorSurface | Color used in CardView Background, Toolbar ... |
| colorOnSurface | Color used in elements inside surfaces as Toolbar title ... |
| colorError | Color used to indicate error status. |
| colorOnError | Color used in text/icons of error messages. |

![alt text](https://github.com/serbelga/android-theming/blob/master/screenshots/color_system.jpg)

## Shape system

...

## Typography system

```xml
<style name="AppTheme" parent="Theme.MaterialComponents.Light.NoActionBar">
    ...
    <item name="textAppearanceHeadline1">
          @style/Headline1Text
    </item>
    <item name="textAppearanceButton">
          @style/ButtonText
    </item>
    ...
</style>

<style name="ButtonText" parent="TextAppearance.MaterialComponents.Button">
    <item name="fontFamily">@font/montserrat</item>
</style>

<style name="Headline1Text" parent="TextAppearance.MaterialComponents.Headline1">
    <item name="fontFamily">@font/montserrat</item>
</style>
```

![alt text](https://github.com/serbelga/android-theming/blob/master/screenshots/typo.png)

## Components style

...
