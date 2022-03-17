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

object FA_JAR_WHEAT: Icon {
	
	override val name get() = "Jar Wheat"
	
	override val unicode get() = "e517"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 320 512"><path d="M32 32C32 14.33 46.33 0 64 0H256C273.7 0 288 14.33 288 32C288 49.67 273.7 64 256 64H64C46.33 64 32 49.67 32 32zM0 160C0 124.7 28.65 96 64 96H256C291.3 96 320 124.7 320 160V448C320 483.3 291.3 512 256 512H64C28.65 512 0 483.3 0 448V160zM192 320C227.3 320 256 291.3 256 256H208C188.9 256 171.7 264.4 160 277.7C148.3 264.4 131.1 256 112 256H64C64 291.3 92.65 320 128 320H192zM192 224C227.3 224 256 195.3 256 160H208C188.9 160 171.7 168.4 160 181.7C148.3 168.4 131.1 160 112 160H64C64 195.3 92.65 224 128 224H192zM192 416C227.3 416 256 387.3 256 352H208C188.9 352 171.7 360.4 160 373.7C148.3 360.4 131.1 352 112 352H64C64 387.3 92.65 416 128 416H144V448C144 456.8 151.2 464 160 464C168.8 464 176 456.8 176 448V416H192z"/></svg>"""
		else -> null
	}
	
}
