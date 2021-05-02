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

object FA_SINK: Icon {
	
	override val name get() = "Sink"
	
	override val unicode get() = "e06d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M32,416a96,96,0,0,0,96,96H384a96,96,0,0,0,96-96V384H32ZM496,288H400V256h64a16,16,0,0,0,16-16V224a16,16,0,0,0-16-16H384a32,32,0,0,0-32,32v48H288V96a32,32,0,0,1,64,0v16a16,16,0,0,0,16,16h32a16,16,0,0,0,16-16V96A96.16,96.16,0,0,0,300.87,1.86C255.29,10.71,224,53.36,224,99.79V288H160V240a32,32,0,0,0-32-32H48a16,16,0,0,0-16,16v16a16,16,0,0,0,16,16h64v32H16A16,16,0,0,0,0,304v32a16,16,0,0,0,16,16H496a16,16,0,0,0,16-16V304A16,16,0,0,0,496,288Z"/></svg>"""
		else -> null
	}
	
}
