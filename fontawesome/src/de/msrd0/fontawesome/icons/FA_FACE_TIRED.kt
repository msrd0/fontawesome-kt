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

object FA_FACE_TIRED: Icon {
	
	override val name get() = "Face Tired"
	
	override val unicode get() = "f5c8"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256zM138.3 364.1C132.2 375.8 128 388.4 128 400C128 405.2 130.6 410.2 134.9 413.2C139.2 416.1 144.7 416.8 149.6 414.1L170.2 407.3C197.1 397.2 225.6 392 254.4 392H257.6C286.4 392 314.9 397.2 341.8 407.3L362.4 414.1C367.3 416.8 372.8 416.1 377.1 413.2C381.4 410.2 384 405.2 384 400C384 388.4 379.8 375.8 373.7 364.1C367.4 352.1 358.4 339.8 347.3 328.7C325.3 306.7 293.4 287.1 256 287.1C218.6 287.1 186.7 306.7 164.7 328.7C153.6 339.8 144.6 352.1 138.3 364.1H138.3zM133.5 146.7C125.6 142.4 116 148.2 116 157.1C116 159.9 116.1 162.6 118.8 164.8L154.8 208L118.8 251.2C116.1 253.4 116 256.1 116 258.9C116 267.8 125.6 273.6 133.5 269.3L223.4 221.4C234.1 215.7 234.1 200.3 223.4 194.6L133.5 146.7zM396 157.1C396 148.2 386.4 142.4 378.5 146.7L288.6 194.6C277.9 200.3 277.9 215.7 288.6 221.4L378.5 269.3C386.4 273.6 396 267.8 396 258.9C396 256.1 395 253.4 393.2 251.2L357.2 208L393.2 164.8C395 162.6 396 159.9 396 157.1V157.1z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M176.5 320.3C196.1 302.1 223.8 288 256 288C288.2 288 315.9 302.1 335.5 320.3C354.5 338.1 368 362 368 384C368 389.4 365.3 394.4 360.8 397.4C356.2 400.3 350.5 400.8 345.6 398.7L328.4 391.1C305.6 381.2 280.9 376 256 376C231.1 376 206.4 381.2 183.6 391.1L166.4 398.7C161.5 400.8 155.8 400.3 151.2 397.4C146.7 394.4 144 389.4 144 384C144 362 157.5 338.1 176.5 320.3zM223.4 194.6C234.1 200.3 234.1 215.7 223.4 221.4L133.5 269.3C125.6 273.6 116 267.8 116 258.9C116 256.1 116.1 253.4 118.8 251.2L154.8 208L118.8 164.8C116.1 162.6 116 159.9 116 157.1C116 148.2 125.6 142.4 133.5 146.7L223.4 194.6zM393.2 164.8L357.2 208L393.2 251.2C395 253.4 396 256.1 396 258.9C396 267.8 386.4 273.6 378.5 269.3L288.6 221.4C277.9 215.7 277.9 200.3 288.6 194.6L378.5 146.7C386.4 142.4 396 148.2 396 157.1C396 159.9 395 162.6 393.2 164.8zM512 256C512 397.4 397.4 512 256 512C114.6 512 0 397.4 0 256C0 114.6 114.6 0 256 0C397.4 0 512 114.6 512 256zM256 48C141.1 48 48 141.1 48 256C48 370.9 141.1 464 256 464C370.9 464 464 370.9 464 256C464 141.1 370.9 48 256 48z"/></svg>"""
		else -> null
	}
	
}

val FA_TIRED = FA_FACE_TIRED
