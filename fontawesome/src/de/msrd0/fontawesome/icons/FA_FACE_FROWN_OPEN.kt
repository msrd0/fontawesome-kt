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

/** Face frown open */
object FA_FACE_FROWN_OPEN: Icon {
	
	override val name get() = "Face frown open"
	
	override val unicode get() = "f57a"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM176.4 240C194 240 208.4 225.7 208.4 208C208.4 190.3 194 176 176.4 176C158.7 176 144.4 190.3 144.4 208C144.4 225.7 158.7 240 176.4 240zM336.4 176C318.7 176 304.4 190.3 304.4 208C304.4 225.7 318.7 240 336.4 240C354 240 368.4 225.7 368.4 208C368.4 190.3 354 176 336.4 176zM259.9 369.4C288.8 369.4 316.2 375.2 340.6 385.5C352.9 390.7 366.7 381.3 361.4 369.1C344.8 330.9 305.6 303.1 259.9 303.1C214.3 303.1 175.1 330.8 158.4 369.1C153.1 381.3 166.1 390.6 179.3 385.4C203.7 375.1 231 369.4 259.9 369.4L259.9 369.4z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M179.3 369.3C166.1 374.5 153.1 365.1 158.4 352.9C175.1 314.7 214.3 287.8 259.9 287.8C305.6 287.8 344.8 314.7 361.4 352.1C366.7 365.2 352.9 374.5 340.6 369.3C316.2 359 288.8 353.2 259.9 353.2C231 353.2 203.7 358.1 179.3 369.3L179.3 369.3zM208.4 208C208.4 225.7 194 240 176.4 240C158.7 240 144.4 225.7 144.4 208C144.4 190.3 158.7 176 176.4 176C194 176 208.4 190.3 208.4 208zM304.4 208C304.4 190.3 318.7 176 336.4 176C354 176 368.4 190.3 368.4 208C368.4 225.7 354 240 336.4 240C318.7 240 304.4 225.7 304.4 208zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_FACE_FROWN_OPEN]. */
val FA_FROWN_OPEN = FA_FACE_FROWN_OPEN
