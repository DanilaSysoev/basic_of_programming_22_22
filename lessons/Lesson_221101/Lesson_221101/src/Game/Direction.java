package Game;

public enum Direction {
    Up {
        @Override
        public Position move(Position position) {
            return new Position(position.getX(), position.getY() - 1);
        }
    },
    Down {
        @Override
        public Position move(Position position) {
            return new Position(position.getX(), position.getY() + 1);
        }
    },
    Left {
        @Override
        public Position move(Position position) {
            return new Position(position.getX() - 1, position.getY());
        }
    },
    Right {
        @Override
        public Position move(Position position) {
            return new Position(position.getX() + 1, position.getY());
        }
    };

    public abstract Position move(Position position);
}
