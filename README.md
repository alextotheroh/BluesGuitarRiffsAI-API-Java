# BluesGuitarRiffsAI-API-Java

## Goal
Viewing the composition of a blues guitar riff as an optimization and search problem, use a genetic algorithm with user-adjustable fitness assessment criteria and probabilities of mutation and crossover to generate blues guitar riffs.

## Assumptions
1. Users want inspiration, not riffs that they can use verbatim.  Given that, we can prioritize "inspiring" over "traditional."  In other words, whenever an arbitrary decision had to be made when writing this code, I erred on the side of being unique or even "strange," rather than generating riffs that are traditionally, and more objectively, "good."
3. Users are not interested in high levels of dissonance.  Considering that, the notes available in the search space are limited. Similarly, the adjustable range of the fitness criteria is limited to produce only "musical" sounding riffs, not mere noise.  This was admittedly a highly subjective decision. 

## Adjustable parameters brainstorm
- population size
- mutation probability
- crossover probability
- num generations
- total "emptiness" (number of rests)
- bends/slides
- adjacent notes are nearby (playability)
- categories of "tricks," ex: tier 1, 2, 3, etc. Blues "tricks" that sound good and are widely utilized.  Hard-code them, and reward for them based on their "tier" (tier 1 highly rewarded, tier 5 not rewarded much, etc.).
- Allow rearrangement of tier membership for above ^
- blues note
- major "off" notes (notes outside pentatonic with a major sound)
- minor "off" notes  (notes outside pentatonic with a minor sound)

## Build
```
mvn clean package
```

## Run locally
```
mvn spring-boot:run
```