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

object FA_BORDER_TOP_LEFT: Icon {
	
	override val name get() = "Border top left"
	
	override val unicode get() = "f853"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M0 112C0 67.82 35.82 32 80 32H416C433.7 32 448 46.33 448 64C448 81.67 433.7 96 416 96H80C71.16 96 64 103.2 64 112V448C64 465.7 49.67 480 32 480C14.33 480 0 465.7 0 448V112zM128 480C110.3 480 96 465.7 96 448C96 430.3 110.3 416 128 416C145.7 416 160 430.3 160 448C160 465.7 145.7 480 128 480zM320 480C302.3 480 288 465.7 288 448C288 430.3 302.3 416 320 416C337.7 416 352 430.3 352 448C352 465.7 337.7 480 320 480zM256 448C256 465.7 241.7 480 224 480C206.3 480 192 465.7 192 448C192 430.3 206.3 416 224 416C241.7 416 256 430.3 256 448zM416 480C398.3 480 384 465.7 384 448C384 430.3 398.3 416 416 416C433.7 416 448 430.3 448 448C448 465.7 433.7 480 416 480zM416 288C398.3 288 384 273.7 384 256C384 238.3 398.3 224 416 224C433.7 224 448 238.3 448 256C448 273.7 433.7 288 416 288zM448 352C448 369.7 433.7 384 416 384C398.3 384 384 369.7 384 352C384 334.3 398.3 320 416 320C433.7 320 448 334.3 448 352zM416 192C398.3 192 384 177.7 384 160C384 142.3 398.3 128 416 128C433.7 128 448 142.3 448 160C448 177.7 433.7 192 416 192z"/></svg>"""
		else -> null
	}
	
}

val FA_BORDER_STYLE = FA_BORDER_TOP_LEFT
