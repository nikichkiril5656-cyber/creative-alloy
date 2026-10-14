# Creative Alloy (NeoForge 1.21.1, Java 21)

Добавляет предмет **Креативный сплав** (`creativealloy:creative_alloy`).

## Рецепт
Объединитель (Combiner) или фабрика объединения из Mekanism:
- основной вход: **Атомный сплав** (`mekanism:alloy_atomic`) x1
- дополнительный вход: **Звезда Незера** (`minecraft:nether_star`) x1
- результат: Креативный сплав x1

Рецепт лежит в `src/main/resources/data/creativealloy/recipe/combining/creative_alloy.json`.
Mekanism (10.7+) — обязательная зависимость.

## Сборка
Нужны JDK 21 и Gradle 8.10+ (или IntelliJ IDEA, как в прошлой инструкции):
    gradle build
Готовый файл: `build/libs/creative-alloy-1.0.0.jar` -> в папку `mods` рядом с Mekanism 10.7.x и NeoForge 21.1.x.

Без установки: залей папку на GitHub, workflow соберёт jar во вкладке Actions.

`gradle runClient` запускает игру сразу с Mekanism (версия задаётся в gradle.properties).
