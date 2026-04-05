import profilePic from "./assets/pfp.jpg";
function Card() {
    return (
        <div className="card">
            <img className="card-image" src={profilePic} alt="profile picture" />
            <h2 className ="card-title">Ecommerce sticker</h2>
            <p className="card-text">I am a 4th year student</p>
        </div>
    );
}

export default Card;