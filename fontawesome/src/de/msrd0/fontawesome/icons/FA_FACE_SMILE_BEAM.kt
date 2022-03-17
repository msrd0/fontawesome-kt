/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID
import de.msrd0.fontawesome.Style.REGULAR

/** Face Smile Beam */
object FA_FACE_SMILE_BEAM: Icon {
	
	override val name get() = "Face Smile Beam"
	
	override val unicode get() = "f5b8"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM164.1 325.5C158.3 318.8 148.2 318.1 141.5 323.9C134.8 329.7 134.1 339.8 139.9 346.5C162.1 372.1 200.9 400 255.1 400C311.1 400 349.8 372.1 372.1 346.5C377.9 339.8 377.2 329.7 370.5 323.9C363.8 318.1 353.7 318.8 347.9 325.5C329.9 346.2 299.4 368 255.1 368C212.6 368 182 346.2 164.1 325.5H164.1zM226.5 231.6C229.8 230.5 232 227.4 232 224C232 206.1 225.3 188.4 215.4 175.2C205.6 162.2 191.5 152 176 152C160.5 152 146.4 162.2 136.6 175.2C126.7 188.4 120 206.1 120 224C120 227.4 122.2 230.5 125.5 231.6C128.7 232.7 132.3 231.6 134.4 228.8L134.4 228.8L134.6 228.5C134.8 228.3 134.1 228 135.3 227.6C135.1 226.8 136.9 225.7 138.1 224.3C140.6 221.4 144.1 217.7 148.3 213.1C157.1 206.2 167.2 200 176 200C184.8 200 194.9 206.2 203.7 213.1C207.9 217.7 211.4 221.4 213.9 224.3C215.1 225.7 216 226.8 216.7 227.6C217 228 217.2 228.3 217.4 228.5L217.6 228.8L217.6 228.8C219.7 231.6 223.3 232.7 226.5 231.6V231.6zM377.6 228.8C379.7 231.6 383.3 232.7 386.5 231.6C389.8 230.5 392 227.4 392 224C392 206.1 385.3 188.4 375.4 175.2C365.6 162.2 351.5 152 336 152C320.5 152 306.4 162.2 296.6 175.2C286.7 188.4 280 206.1 280 224C280 227.4 282.2 230.5 285.5 231.6C288.7 232.7 292.3 231.6 294.4 228.8L294.4 228.8L294.6 228.5C294.8 228.3 294.1 228 295.3 227.6C295.1 226.8 296.9 225.7 298.1 224.3C300.6 221.4 304.1 217.7 308.3 213.1C317.1 206.2 327.2 200 336 200C344.8 200 354.9 206.2 363.7 213.1C367.9 217.7 371.4 221.4 373.9 224.3C375.1 225.7 376 226.8 376.7 227.6C377 228 377.2 228.3 377.4 228.5L377.6 228.8L377.6 228.8z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 352C293.2 352 319.2 334.5 334.4 318.1C343.3 308.4 358.5 307.7 368.3 316.7C378 325.7 378.6 340.9 369.6 350.6C347.7 374.5 309.7 400 256 400C202.3 400 164.3 374.5 142.4 350.6C133.4 340.9 133.1 325.7 143.7 316.7C153.5 307.7 168.7 308.4 177.6 318.1C192.8 334.5 218.8 352 256 352zM217.6 228.8L217.6 228.8L217.4 228.5C217.2 228.3 217 228 216.7 227.6C216 226.8 215.1 225.7 213.9 224.3C211.4 221.4 207.9 217.7 203.7 213.1C194.9 206.2 184.8 200 176 200C167.2 200 157.1 206.2 148.3 213.1C144.1 217.7 140.6 221.4 138.1 224.3C136.9 225.7 135.1 226.8 135.3 227.6C134.1 228 134.8 228.3 134.6 228.5L134.4 228.8L134.4 228.8C132.3 231.6 128.7 232.7 125.5 231.6C122.2 230.5 120 227.4 120 224C120 206.1 126.7 188.4 136.6 175.2C146.4 162.2 160.5 152 176 152C191.5 152 205.6 162.2 215.4 175.2C225.3 188.4 232 206.1 232 224C232 227.4 229.8 230.5 226.5 231.6C223.3 232.7 219.7 231.6 217.6 228.8V228.8zM377.6 228.8L377.4 228.5C377.2 228.3 377 228 376.7 227.6C376 226.8 375.1 225.7 373.9 224.3C371.4 221.4 367.9 217.7 363.7 213.1C354.9 206.2 344.8 200 336 200C327.2 200 317.1 206.2 308.3 213.1C304.1 217.7 300.6 221.4 298.1 224.3C296.9 225.7 295.1 226.8 295.3 227.6C294.1 228 294.8 228.3 294.6 228.5L294.4 228.8L294.4 228.8C292.3 231.6 288.7 232.7 285.5 231.6C282.2 230.5 280 227.4 280 224C280 206.1 286.7 188.4 296.6 175.2C306.4 162.2 320.5 152 336 152C351.5 152 365.6 162.2 375.4 175.2C385.3 188.4 392 206.1 392 224C392 227.4 389.8 230.5 386.5 231.6C383.3 232.7 379.7 231.6 377.6 228.8L377.6 228.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_FACE_SMILE_BEAM]. */
val FA_SMILE_BEAM = FA_FACE_SMILE_BEAM
