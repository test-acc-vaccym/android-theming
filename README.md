# Material Components - Android Theming

Material Theming refers to the customization of your Material Design app to reflect your product’s brand

## Color system

The Material Design color system uses an organized approach to applying color to your UI. In this system, two theme colors are selected to express different parts of a UI: a primary color and a secondary color. Material components use these theme colors and their variations to style their individual backgrounds, text, and more.

### Usage
```xml
<style name="AppTheme" parent="Theme.MaterialComponents.Light.NoActionBar">
</style>
```

| Attribute  | Definition |
| ------------- | ------------- |
| colorPrimary  | Color displayed most frequently across your app’s screens and components. The button color is the color primary |
| colorPrimaryDark  | Color displayed in Status Bar if statusBarColor attribute is not defined. |
| colorSecondary | Color used in FAB, checkboxes, switches ... |


