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

object FA_CHURCH: Icon {
	
	override val name get() = "Church"
	
	override val unicode get() = "f51d"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M344 48H376C389.3 48 400 58.75 400 72C400 85.25 389.3 96 376 96H344V142.4L456.7 210C471.2 218.7 480 234.3 480 251.2V512H384V416C384 380.7 355.3 352 320 352C284.7 352 256 380.7 256 416V512H160V251.2C160 234.3 168.8 218.7 183.3 210L296 142.4V96H264C250.7 96 240 85.25 240 72C240 58.75 250.7 48 264 48H296V24C296 10.75 306.7 0 320 0C333.3 0 344 10.75 344 24V48zM24.87 330.3L128 273.6V512H48C21.49 512 0 490.5 0 464V372.4C0 354.9 9.53 338.8 24.87 330.3V330.3zM592 512H512V273.6L615.1 330.3C630.5 338.8 640 354.9 640 372.4V464C640 490.5 618.5 512 592 512V512z"/></svg>"""
		else -> null
	}
	
}
