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

/** Face Sad Cry */
object FA_FACE_SAD_CRY: Icon {
	
	override val name get() = "Face Sad Cry"
	
	override val unicode get() = "f5b3"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M352 493.4C322.4 505.4 289.9 512 256 512C222.1 512 189.6 505.4 160 493.4V288C160 279.2 152.8 272 144 272C135.2 272 128 279.2 128 288V477.8C51.48 433.5 0 350.8 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 350.8 460.5 433.5 384 477.8V288C384 279.2 376.8 272 368 272C359.2 272 352 279.2 352 288V493.4zM217.6 236.8C224.7 231.5 226.1 221.5 220.8 214.4C190.4 173.9 129.6 173.9 99.2 214.4C93.9 221.5 95.33 231.5 102.4 236.8C109.5 242.1 119.5 240.7 124.8 233.6C142.4 210.1 177.6 210.1 195.2 233.6C200.5 240.7 210.5 242.1 217.6 236.8zM316.8 233.6C334.4 210.1 369.6 210.1 387.2 233.6C392.5 240.7 402.5 242.1 409.6 236.8C416.7 231.5 418.1 221.5 412.8 214.4C382.4 173.9 321.6 173.9 291.2 214.4C285.9 221.5 287.3 231.5 294.4 236.8C301.5 242.1 311.5 240.7 316.8 233.6zM208 368C208 394.5 229.5 416 256 416C282.5 416 304 394.5 304 368V336C304 309.5 282.5 288 256 288C229.5 288 208 309.5 208 336V368z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M159.6 220C148.1 220 139.7 223.8 134.2 229.7C126.7 237.7 114 238.1 105.1 230.6C97.89 223 97.48 210.4 105 202.3C119.6 186.8 140.3 180 159.6 180C178.1 180 199.7 186.8 214.2 202.3C221.8 210.4 221.4 223 213.3 230.6C205.2 238.1 192.6 237.7 185 229.7C179.6 223.8 170.3 220 159.6 220zM297.9 230.6C289.9 223 289.5 210.4 297 202.3C311.6 186.8 332.3 180 351.6 180C370.1 180 391.7 186.8 406.2 202.3C413.8 210.4 413.4 223 405.3 230.6C397.2 238.1 384.6 237.7 377 229.7C371.6 223.8 362.3 220 351.6 220C340.1 220 331.7 223.8 326.2 229.7C318.7 237.7 306 238.1 297.9 230.6zM208 320C208 293.5 229.5 272 256 272C282.5 272 304 293.5 304 320V352C304 378.5 282.5 400 256 400C229.5 400 208 378.5 208 352V320zM0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM400 406.1C439.4 368.2 464 314.1 464 256C464 141.1 370.9 48 256 48C141.1 48 48 141.1 48 256C48 314.1 72.55 368.2 112 406.1V288C112 274.7 122.7 264 136 264C149.3 264 160 274.7 160 288V440.6C188.7 455.5 221.4 464 256 464C290.6 464 323.3 455.5 352 440.6V288C352 274.7 362.7 264 376 264C389.3 264 400 274.7 400 288V406.1z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_FACE_SAD_CRY]. */
val FA_SAD_CRY = FA_FACE_SAD_CRY
