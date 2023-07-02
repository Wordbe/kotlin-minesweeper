package domain

class Row(
    private val cells: MutableList<Cell>
) : MutableList<Cell> by cells {
    companion object {
        fun of(width: Int, row: Int, mineCoordinates: Set<Coordinate>): Row {
            val cells = (Coordinate.COL_START_POSITION until width).map { col ->
                val isMine = mineCoordinates.contains(Coordinate(row, col))
                Cell.of(isMine)
            }
            return Row(cells.toMutableList())
        }
    }
}
