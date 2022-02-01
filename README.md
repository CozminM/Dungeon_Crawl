<!-- TABLE OF CONTENTS -->

# Dungeon Crawl Roguelike game

<summary><h2 style="display: inline-block">Table of Contents</h2></summary>
<ol>
<li>
    <a href="#about-the-project">About The Project</a>
    <ul>
    <li><a href="#built-with">Built With</a></li>
    </ul>
</li>
<li>
    <a href="#getting-started">Getting Started</a>
    <ul>
    <li><a href="#prerequisites">Prerequisites</a></li>
    </ul>
</li>

</ol>

<!-- ABOUT THE PROJECT -->

## About The Project

This is a roguelike game that follows a hero on his journey to rescue the princess. The hero can be moved
by using the WASD keys, pick up items from the ground and use them from the inventory to boost his stats
(life points and attack damage), go through doors to advance to the next map (but beware that some doors require
a key to be opened) and battle with various types of monsters, each with their unique behaviour.

Application features include:

- Main menu, where you can name your hero<br/><br/>
  <img src="https://raw.githubusercontent.com/CozminM/Dungeon_Crawl/master/public/main-menu.png" height="500" width="auto">
  <br/>
  <br/>
  <br/>

- Save/load functionality, so you can take a break and come back to the same point you left<br/><br/>
  <img src="https://raw.githubusercontent.com/CozminM/Dungeon_Crawl/master/public/save-menu.png" height="500" width="auto">
  <br/><br/>
  <img src="https://raw.githubusercontent.com/CozminM/Dungeon_Crawl/master/public/load-menu.png" height="500" width="auto">
  <br/><br/><br/>

- Multiple maps, items and monsters you can encounter during your adventures<br/><br/>
  <img src="https://raw.githubusercontent.com/CozminM/Dungeon_Crawl/master/public/first-map.png" height="500" width="auto">
  <br/><br/>
  <img src="https://raw.githubusercontent.com/CozminM/Dungeon_Crawl/master/public/last-map.png" height="500" width="auto">
  <br/><br/><br/>

- Win by saving the princess or die if the monsters reduce your life points to 0 <br/><br/>
  <img src="https://raw.githubusercontent.com/CozminM/Dungeon_Crawl/master/public/end-menu.png" height="500" width="auto">
  <br/><br/><br/>

## Future implementation

- Update main menu and inventory UI
- Add new maps, items, monsters
- Add ranged combat


### Built With

- Maven
- Java
- JavaFX
- Postgresql

<!-- GETTING STARTED -->

## Getting Started

To get a local copy up and running follow these simple steps.

### Prerequisites

1. Clone the repo
   ```sh
   git clone https://github.com/github_username/repo_name.git
   ```
2. Create your own application.properies file in the resources directory and write
   ```
    DATABASE = databaseName
    USERNAME = yourUsername
    PASSWORD = yourPassword
   ```

3. Run the sql script from the sample_data folder in your database

4. Make sure your device can run all the technologies in the build section
