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

/** Venus Mars */
object FA_VENUS_MARS: Icon {
	
	override val name get() = "Venus Mars"
	
	override val unicode get() = "f228"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M256 384H208v-35.05C289.9 333.9 352 262.3 352 176c0-97.2-78.8-176-176-176c-97.2 0-176 78.8-176 176c0 86.26 62.1 157.9 144 172.1v35.05H96c-8.836 0-16 7.162-16 16v32c0 8.836 7.164 16 16 16h48v48c0 8.836 7.164 16 16 16h32c8.838 0 16-7.164 16-16v-48H256c8.838 0 16-7.164 16-16v-32C272 391.2 264.8 384 256 384zM176 272c-52.93 0-96-43.07-96-96c0-52.94 43.07-96 96-96c52.94 0 96 43.06 96 96C272 228.9 228.9 272 176 272zM624 0h-112.4c-21.38 0-32.09 25.85-16.97 40.97l29.56 29.56l-24.55 24.55c-29.97-20.66-64.81-31.05-99.74-31.05c-15.18 0-30.42 2.225-45.19 6.132c13.55 22.8 22.82 48.36 26.82 75.67c6.088-1.184 12.27-1.785 18.45-1.785c24.58 0 49.17 9.357 67.88 28.07c37.43 37.43 37.43 98.33 0 135.8c-18.71 18.71-43.3 28.07-67.88 28.07c-23.55 0-46.96-8.832-65.35-26.01c-15.92 18.84-34.93 35.1-56.75 47.35c11.45 5.898 20.17 16.3 23.97 28.82C331.5 406 365.7 416 400 416c45.04 0 90.08-17.18 124.5-51.55c60.99-60.99 67.73-155.6 20.47-224.1l24.55-24.55l29.56 29.56c4.889 4.889 10.9 7.078 16.8 7.078C628.2 152.4 640 142.8 640 128.4V16C640 7.164 632.8 0 624 0z"/></svg>"""
		else -> null
	}
	
}
