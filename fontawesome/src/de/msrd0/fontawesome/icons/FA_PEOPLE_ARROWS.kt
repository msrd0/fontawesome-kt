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

object FA_PEOPLE_ARROWS: Icon {
	
	override val name get() = "People Arrows"
	
	override val unicode get() = "e068"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M96,128A64,64,0,1,0,32,64,64,64,0,0,0,96,128Zm0,176.08a44.11,44.11,0,0,1,13.64-32L181.77,204c1.65-1.55,3.77-2.31,5.61-3.57A63.91,63.91,0,0,0,128,160H64A64,64,0,0,0,0,224v96a32,32,0,0,0,32,32V480a32,32,0,0,0,32,32h64a32,32,0,0,0,32-32V383.61l-50.36-47.53A44.08,44.08,0,0,1,96,304.08ZM480,128a64,64,0,1,0-64-64A64,64,0,0,0,480,128Zm32,32H448a63.91,63.91,0,0,0-59.38,40.42c1.84,1.27,4,2,5.62,3.59l72.12,68.06a44.37,44.37,0,0,1,0,64L416,383.62V480a32,32,0,0,0,32,32h64a32,32,0,0,0,32-32V352a32,32,0,0,0,32-32V224A64,64,0,0,0,512,160ZM444.4,295.34l-72.12-68.06A12,12,0,0,0,352,236v36H224V236a12,12,0,0,0-20.28-8.73L131.6,295.34a12.4,12.4,0,0,0,0,17.47l72.12,68.07A12,12,0,0,0,224,372.14V336H352v36.14a12,12,0,0,0,20.28,8.74l72.12-68.07A12.4,12.4,0,0,0,444.4,295.34Z"/></svg>"""
		else -> null
	}
	
}
