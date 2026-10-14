# Creative Alloy (NeoForge 1.21.1, Java 21)

Добавляет два предмета:
- **Креативный сплав** (`creativealloy:creative_alloy`) делается в Объединителе Mekanism: Атомный сплав + Звезда Незера.
- **Креативная схема управления** (`creativealloy:creative_control_circuit`): 2 Креативных сплава + Совершенная схема управления Mekanism в ряд.

И крафты креативных предметов из других модов. Все они работают только если соответствующий мод установлен
(условие `neoforge:mod_loaded`), Mekanism обязателен.

## Шаблон крафта (верстак)

    F X F      F — материал мода (4–5 шт.)      X — Креативная схема управления
    A T A      A — Креативный сплав (2 шт.)     T — высшая обычная версия предмета
    F E F      E — дополнительный компонент (если нет, на его месте F)

## Рецепты

| Результат | Мод | T (основа) | F (материал) | E |
|---|---|---|---|---|
| Креативный энергокуб | Mekanism | Совершенный энергокуб | Рафинированный светящийся камень | F |
| Креативный ящик | Mekanism | Совершенный ящик | Рафинированный обсидиан | F |
| Креативный бак жидкости | Mekanism | Совершенный бак жидкости | Тонированное стекло | F |
| Креативный бак химикатов | Mekanism | Совершенный бак химикатов | Рафинированный обсидиан | Рафинированный светящийся камень |
| Creative Motor | Create | Steam Engine | Precision Mechanism | Electron Tube |
| Creative Fluid Tank | Create | Fluid Tank | Copper Casing | Mechanical Pump |
| Creative Blaze Cake | Create | Blaze Cake | Blaze Rod | Magma Cream |
| Creative Generator | Create Crafts & Additions | Alternator | Capacitor | Electrum Ingot |
| Creative Autocannon Ammo Container | Create Big Cannons | Autocannon Ammo Container | Nethersteel Ingot | Gunpowder |
| Creative Thruster | Create Propulsion: Simulated | Ion Thruster | Brass Casing | Precision Mechanism |
| Creative Vector Thruster | Create Propulsion: Simulated | Vector Thruster | Brass Casing | Precision Mechanism |
| Creative Energy Cell | Applied Energistics 2 | Dense Energy Cell | Engineering Processor | Singularity |
| Creative ME Storage Cell | Applied Energistics 2 | 256k ME Item Storage Cell | Calculation Processor | Singularity |
| Creative Controller | Refined Storage | Controller | Advanced Processor | F |
| Creative Wireless Grid | Refined Storage | Wireless Grid | Improved Processor | F |
| Creative Portable Grid | Refined Storage | Portable Grid | Improved Processor | F |
| Creative Range Upgrade | Refined Storage | Range Upgrade | Improved Processor | F |
| Creative Wireless Autocrafting Monitor | Refined Storage | Wireless Autocrafting Monitor | Improved Processor | F |

В Create: Aeronautics и Sophisticated Backpacks креативных предметов нет, поэтому для них рецептов нет.
Рецепты лежат в `src/main/resources/data/creativealloy/recipe/crafting/`, их можно править как обычные JSON.

## Сборка
Нужны JDK 21 и Gradle 8.10+ (или IntelliJ IDEA, или GitHub Actions, workflow уже есть):

    gradle build

Готовый файл: `build/libs/creative-alloy-1.1.0.jar` -> в папку `mods` рядом с Mekanism 10.7.x и NeoForge 21.1.x.
